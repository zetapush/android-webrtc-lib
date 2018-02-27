package com.zetapush.webrtc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.zetapush.client.highlevel.ZetapushClient;
import com.zetapush.core.visio.addToMissedCallCompletion;
import com.zetapush.core.visio.callGroupCompletion;
import com.zetapush.core.visio.getCurrentCallByUserCompletion;
import com.zetapush.core.visio.getMissedCallByUserCompletion;
import com.zetapush.core.visio.setCallAcceptedCompletion;
import com.zetapush.core.visio.setCallRefusedCompletion;
import com.zetapush.core.visio.setCallTerminatedCompletion;
import com.zetapush.core.visio.timeoutCallCompletion;
import com.zetapush.core.file.confirmFileUploadCompletion;
import com.zetapush.core.file.deleteFileEntryCompletion;
import com.zetapush.core.file.getFileEntryCompletion;
import com.zetapush.core.file.getFileEntryListCompletion;
import com.zetapush.core.file.requestFileUploadCompletion;
import com.zetapush.core.group.addGroupMemberCompletion;
import com.zetapush.core.group.createGroupCompletion;
import com.zetapush.core.group.deleteGroupCompletion;
import com.zetapush.core.group.getGroupCompletion;
import com.zetapush.core.group.getGroupListCompletion;
import com.zetapush.core.group.getUserGroupListCompletion;
import com.zetapush.core.group.isMemberOfCompletion;
import com.zetapush.core.group.removeGroupMemberCompletion;
import com.zetapush.core.room.RoomObjectFactory;
import com.zetapush.core.room.acceptRoomInvitationCompletion;
import com.zetapush.core.room.addRoomMemberCompletion;
import com.zetapush.core.room.addRoomMessageCompletion;
import com.zetapush.core.room.createOneToOneRoomCompletion;
import com.zetapush.core.room.createOrJoinPublicRoomCompletion;
import com.zetapush.core.room.createRoomCompletion;
import com.zetapush.core.room.createRoomInput;
import com.zetapush.core.room.createRoomInvitationCompletion;
import com.zetapush.core.room.createRoomMemberInvitationCompletion;
import com.zetapush.core.room.createRoomOutput;
import com.zetapush.core.room.getRoomCompletion;
import com.zetapush.core.room.getRoomMessageCompletion;
import com.zetapush.core.room.getRoomMessageListCompletion;
import com.zetapush.core.room.getUserRoomListCompletion;
import com.zetapush.core.room.leavePublicRoomCompletion;
import com.zetapush.core.room.purgeRoomMessageListCompletion;
import com.zetapush.core.room.removeRoomMemberCompletion;
import com.zetapush.core.room.sendRoomMessageToMemberCompletion;
import com.zetapush.core.room.updateRoomMessageByServiceCompletion;
import com.zetapush.core.user.confirmUserPasswordCompletion;
import com.zetapush.core.user.createUserCompletion;
import com.zetapush.core.user.getUserByLoginCompletion;
import com.zetapush.core.user.getUserCompletion;
import com.zetapush.core.user.getUserListCompletion;
import com.zetapush.core.user.resetUserPasswordByLoginCompletion;
import com.zetapush.core.user.resetUserPasswordCompletion;
import com.zetapush.core.user.updateUserAvatarCompletion;
import com.zetapush.core.user.updateUserCompletion;
import com.zetapush.core.utils.getMetadataCompletion;
import com.zetapush.core.utils.getTagsCompletion;
import com.zetapush.core.utils.getTargetsCompletion;
import com.zetapush.core.utils.removeMetadataCompletion;
import com.zetapush.core.utils.removeTagsCompletion;
import com.zetapush.core.utils.removeTargetsCompletion;
import com.zetapush.core.utils.setMetadataCompletion;
import com.zetapush.core.utils.setTagsCompletion;
import com.zetapush.core.utils.setTargetsCompletion;
import com.zetapush.library.ZetaPushBaseActivity;
import com.zetapush.library.ZetaPushConnectionEvent;
import com.zetapush.library.ZetaPushService;
import com.zetapush.visio.VisioAsyncApiListener;
import com.zetapush.visio.VisioFutureApi;

import org.appspot.apprtc.CallActivity;
import org.appspot.apprtc.SettingsActivity;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ZetapushConnectActivity extends ZetaPushBaseActivity implements VisioAsyncApiListener, ZetaPushConnectionEvent {

    private static final String UserIdWebDamien = "aiJFIoH7QYoPwRGJZZjMeQ";
    private static final String TAG = "ZetapushConnectActivity";

    private static final int CONNECTION_REQUEST = 1;

    private Button btnLaunch;
    private Button btnLaunchPublicRoom;
    private Button btnVisio;
    private Button btnSettings;
    private EditText etRoomName;
    private ZetapushClient zetapushClient;
    private VisioFutureApi futureApi;
    // flag to avoid multiple registration of cometD listeners
    private boolean alreadyCreated = false;

    private String userId;
    private String targetId = UserIdWebDamien;
    private String roomId = "";
    private String inviteId = "";
    private String publicRoomName = "";

    private boolean visioOwner = false;

    private SharedPreferences sharedPref;
    private String keyprefVideoCallEnabled;
    private String keyprefScreencapture;
    private String keyprefCamera2;
    private String keyprefResolution;
    private String keyprefFps;
    private String keyprefCaptureQualitySlider;
    private String keyprefVideoBitrateType;
    private String keyprefVideoBitrateValue;
    private String keyprefVideoCodec;
    private String keyprefAudioBitrateType;
    private String keyprefAudioBitrateValue;
    private String keyprefAudioCodec;
    private String keyprefHwCodecAcceleration;
    private String keyprefCaptureToTexture;
    private String keyprefFlexfec;
    private String keyprefNoAudioProcessingPipeline;
    private String keyprefAecDump;
    private String keyprefOpenSLES;
    private String keyprefDisableBuiltInAec;
    private String keyprefDisableBuiltInAgc;
    private String keyprefDisableBuiltInNs;
    private String keyprefEnableLevelControl;
    private String keyprefDisableWebRtcAGCAndHPF;
    private String keyprefDisplayHud;
    private String keyprefTracing;
    private String keyprefRoomServerUrl;
    private String keyprefRoom;
    private String keyprefRoomList;
    private ArrayAdapter<String> adapter;
    private String keyprefEnableDataChannel;
    private String keyprefOrdered;
    private String keyprefMaxRetransmitTimeMs;
    private String keyprefMaxRetransmits;
    private String keyprefDataProtocol;
    private String keyprefNegotiated;
    private String keyprefDataId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initConnectionEvent(this);

        // Get setting keys.
        PreferenceManager.setDefaultValues(this, R.xml.preferences, false);
        sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        keyprefVideoCallEnabled = getString(R.string.pref_videocall_key);
        keyprefScreencapture = getString(R.string.pref_screencapture_key);
        keyprefCamera2 = getString(R.string.pref_camera2_key);
        keyprefResolution = getString(R.string.pref_resolution_key);
        keyprefFps = getString(R.string.pref_fps_key);
        keyprefCaptureQualitySlider = getString(R.string.pref_capturequalityslider_key);
        keyprefVideoBitrateType = getString(R.string.pref_maxvideobitrate_key);
        keyprefVideoBitrateValue = getString(R.string.pref_maxvideobitratevalue_key);
        keyprefVideoCodec = getString(R.string.pref_videocodec_key);
        keyprefHwCodecAcceleration = getString(R.string.pref_hwcodec_key);
        keyprefCaptureToTexture = getString(R.string.pref_capturetotexture_key);
        keyprefFlexfec = getString(R.string.pref_flexfec_key);
        keyprefAudioBitrateType = getString(R.string.pref_startaudiobitrate_key);
        keyprefAudioBitrateValue = getString(R.string.pref_startaudiobitratevalue_key);
        keyprefAudioCodec = getString(R.string.pref_audiocodec_key);
        keyprefNoAudioProcessingPipeline = getString(R.string.pref_noaudioprocessing_key);
        keyprefAecDump = getString(R.string.pref_aecdump_key);
        keyprefOpenSLES = getString(R.string.pref_opensles_key);
        keyprefDisableBuiltInAec = getString(R.string.pref_disable_built_in_aec_key);
        keyprefDisableBuiltInAgc = getString(R.string.pref_disable_built_in_agc_key);
        keyprefDisableBuiltInNs = getString(R.string.pref_disable_built_in_ns_key);
        keyprefEnableLevelControl = getString(R.string.pref_enable_level_control_key);
        keyprefDisableWebRtcAGCAndHPF = getString(R.string.pref_disable_webrtc_agc_and_hpf_key);
        keyprefDisplayHud = getString(R.string.pref_displayhud_key);
        keyprefTracing = getString(R.string.pref_tracing_key);
        keyprefRoomServerUrl = getString(R.string.pref_room_server_url_key);
        keyprefRoom = getString(R.string.pref_room_key);
        keyprefRoomList = getString(R.string.pref_room_list_key);
        keyprefEnableDataChannel = getString(R.string.pref_enable_datachannel_key);
        keyprefOrdered = getString(R.string.pref_ordered_key);
        keyprefMaxRetransmitTimeMs = getString(R.string.pref_max_retransmit_time_ms_key);
        keyprefMaxRetransmits = getString(R.string.pref_max_retransmits_key);
        keyprefDataProtocol = getString(R.string.pref_data_protocol_key);
        keyprefNegotiated = getString(R.string.pref_negotiated_key);
        keyprefDataId = getString(R.string.pref_data_id_key);


        setContentView(R.layout.activity_zetapush_connect);

        btnLaunch = (Button) findViewById(R.id.buttonLaunch);
        btnLaunchPublicRoom = (Button) findViewById(R.id.buttonPublicRoom);

        etRoomName = (EditText) findViewById(R.id.editTextRoomName);
        btnVisio = (Button) findViewById(R.id.buttonVisio);
        btnSettings = (Button) findViewById(R.id.buttonSettings);

        btnLaunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchPrivateRoom();
            }
        });

        btnLaunchPublicRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchPublicRoom();
            }
        });

        btnVisio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchVisioActivity();
            }
        });

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ZetapushConnectActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void launchVisioActivity() {
        Intent intent = new Intent(this, ZetapushVisioActivity.class);
        intent.putExtra(ZetapushVisioActivity.VISIO_ROOMID, roomId);
        intent.putExtra(ZetapushVisioActivity.VISIO_INVITEID, inviteId);
        intent.putExtra(ZetapushVisioActivity.VISIO_TARGETID, targetId);
        intent.putExtra(ZetapushVisioActivity.VISIO_OWNER, visioOwner);
        intent.putExtra(ZetapushVisioActivity.VISIO_PUBLICROOMNAME, publicRoomName);
        //intent.putExtra(ZetapushVisioActivity.VISIO_OWNER, )

        boolean useValuesFromIntent = false;

        // Video call enabled flag.
        boolean videoCallEnabled = sharedPrefGetBoolean(R.string.pref_videocall_key,
                CallActivity.EXTRA_VIDEO_CALL, R.string.pref_videocall_default, useValuesFromIntent);

        // Use screencapture option.
        boolean useScreencapture = sharedPrefGetBoolean(R.string.pref_screencapture_key,
                CallActivity.EXTRA_SCREENCAPTURE, R.string.pref_screencapture_default, useValuesFromIntent);

        // Use Camera2 option.
        boolean useCamera2 = sharedPrefGetBoolean(R.string.pref_camera2_key, CallActivity.EXTRA_CAMERA2,
                R.string.pref_camera2_default, useValuesFromIntent);

        // Get default codecs.
        String videoCodec = sharedPrefGetString(R.string.pref_videocodec_key,
                CallActivity.EXTRA_VIDEOCODEC, R.string.pref_videocodec_default, useValuesFromIntent);
        String audioCodec = sharedPrefGetString(R.string.pref_audiocodec_key,
                CallActivity.EXTRA_AUDIOCODEC, R.string.pref_audiocodec_default, useValuesFromIntent);

        // Check HW codec flag.
        boolean hwCodec = sharedPrefGetBoolean(R.string.pref_hwcodec_key,
                CallActivity.EXTRA_HWCODEC_ENABLED, R.string.pref_hwcodec_default, useValuesFromIntent);

        // Check Capture to texture.
        boolean captureToTexture = sharedPrefGetBoolean(R.string.pref_capturetotexture_key,
                CallActivity.EXTRA_CAPTURETOTEXTURE_ENABLED, R.string.pref_capturetotexture_default,
                useValuesFromIntent);

        // Check FlexFEC.
        boolean flexfecEnabled = sharedPrefGetBoolean(R.string.pref_flexfec_key,
                CallActivity.EXTRA_FLEXFEC_ENABLED, R.string.pref_flexfec_default, useValuesFromIntent);

        // Check Disable Audio Processing flag.
        boolean noAudioProcessing = sharedPrefGetBoolean(R.string.pref_noaudioprocessing_key,
                CallActivity.EXTRA_NOAUDIOPROCESSING_ENABLED, R.string.pref_noaudioprocessing_default,
                useValuesFromIntent);

        // Check Disable Audio Processing flag.
        boolean aecDump = sharedPrefGetBoolean(R.string.pref_aecdump_key,
                CallActivity.EXTRA_AECDUMP_ENABLED, R.string.pref_aecdump_default, useValuesFromIntent);

        // Check OpenSL ES enabled flag.
        boolean useOpenSLES = sharedPrefGetBoolean(R.string.pref_opensles_key,
                CallActivity.EXTRA_OPENSLES_ENABLED, R.string.pref_opensles_default, useValuesFromIntent);

        // Check Disable built-in AEC flag.
        boolean disableBuiltInAEC = sharedPrefGetBoolean(R.string.pref_disable_built_in_aec_key,
                CallActivity.EXTRA_DISABLE_BUILT_IN_AEC, R.string.pref_disable_built_in_aec_default,
                useValuesFromIntent);

        // Check Disable built-in AGC flag.
        boolean disableBuiltInAGC = sharedPrefGetBoolean(R.string.pref_disable_built_in_agc_key,
                CallActivity.EXTRA_DISABLE_BUILT_IN_AGC, R.string.pref_disable_built_in_agc_default,
                useValuesFromIntent);

        // Check Disable built-in NS flag.
        boolean disableBuiltInNS = sharedPrefGetBoolean(R.string.pref_disable_built_in_ns_key,
                CallActivity.EXTRA_DISABLE_BUILT_IN_NS, R.string.pref_disable_built_in_ns_default,
                useValuesFromIntent);

        // Check Enable level control.
        boolean enableLevelControl = sharedPrefGetBoolean(R.string.pref_enable_level_control_key,
                CallActivity.EXTRA_ENABLE_LEVEL_CONTROL, R.string.pref_enable_level_control_key,
                useValuesFromIntent);

        // Check Disable gain control
        boolean disableWebRtcAGCAndHPF = sharedPrefGetBoolean(
                R.string.pref_disable_webrtc_agc_and_hpf_key, CallActivity.EXTRA_DISABLE_WEBRTC_AGC_AND_HPF,
                R.string.pref_disable_webrtc_agc_and_hpf_key, useValuesFromIntent);

        // Get video resolution from settings.
        int videoWidth = 0;
        int videoHeight = 0;
        if (useValuesFromIntent) {
            videoWidth = getIntent().getIntExtra(CallActivity.EXTRA_VIDEO_WIDTH, 0);
            videoHeight = getIntent().getIntExtra(CallActivity.EXTRA_VIDEO_HEIGHT, 0);
        }
        if (videoWidth == 0 && videoHeight == 0) {
            String resolution =
                    sharedPref.getString(keyprefResolution, getString(R.string.pref_resolution_default));
            String[] dimensions = resolution.split("[ x]+");
            if (dimensions.length == 2) {
                try {
                    videoWidth = Integer.parseInt(dimensions[0]);
                    videoHeight = Integer.parseInt(dimensions[1]);
                } catch (NumberFormatException e) {
                    videoWidth = 0;
                    videoHeight = 0;
                    Log.e(TAG, "Wrong video resolution setting: " + resolution);
                }
            }
        }

        // Get camera fps from settings.
        int cameraFps = 0;
        if (useValuesFromIntent) {
            cameraFps = getIntent().getIntExtra(CallActivity.EXTRA_VIDEO_FPS, 0);
        }
        if (cameraFps == 0) {
            String fps = sharedPref.getString(keyprefFps, getString(R.string.pref_fps_default));
            String[] fpsValues = fps.split("[ x]+");
            if (fpsValues.length == 2) {
                try {
                    cameraFps = Integer.parseInt(fpsValues[0]);
                } catch (NumberFormatException e) {
                    cameraFps = 0;
                    Log.e(TAG, "Wrong camera fps setting: " + fps);
                }
            }
        }

        // Check capture quality slider flag.
        boolean captureQualitySlider = sharedPrefGetBoolean(R.string.pref_capturequalityslider_key,
                CallActivity.EXTRA_VIDEO_CAPTUREQUALITYSLIDER_ENABLED,
                R.string.pref_capturequalityslider_default, useValuesFromIntent);

        // Get video and audio start bitrate.
        int videoStartBitrate = 0;
        if (useValuesFromIntent) {
            videoStartBitrate = getIntent().getIntExtra(CallActivity.EXTRA_VIDEO_BITRATE, 0);
        }
        if (videoStartBitrate == 0) {
            String bitrateTypeDefault = getString(R.string.pref_maxvideobitrate_default);
            String bitrateType = sharedPref.getString(keyprefVideoBitrateType, bitrateTypeDefault);
            if (!bitrateType.equals(bitrateTypeDefault)) {
                String bitrateValue = sharedPref.getString(
                        keyprefVideoBitrateValue, getString(R.string.pref_maxvideobitratevalue_default));
                videoStartBitrate = Integer.parseInt(bitrateValue);
            }
        }

        int audioStartBitrate = 0;
        if (useValuesFromIntent) {
            audioStartBitrate = getIntent().getIntExtra(CallActivity.EXTRA_AUDIO_BITRATE, 0);
        }
        if (audioStartBitrate == 0) {
            String bitrateTypeDefault = getString(R.string.pref_startaudiobitrate_default);
            String bitrateType = sharedPref.getString(keyprefAudioBitrateType, bitrateTypeDefault);
            if (!bitrateType.equals(bitrateTypeDefault)) {
                String bitrateValue = sharedPref.getString(
                        keyprefAudioBitrateValue, getString(R.string.pref_startaudiobitratevalue_default));
                audioStartBitrate = Integer.parseInt(bitrateValue);
            }
        }

        // Check statistics display option.
        boolean displayHud = sharedPrefGetBoolean(R.string.pref_displayhud_key,
                CallActivity.EXTRA_DISPLAY_HUD, R.string.pref_displayhud_default, useValuesFromIntent);

        boolean tracing = sharedPrefGetBoolean(R.string.pref_tracing_key, CallActivity.EXTRA_TRACING,
                R.string.pref_tracing_default, useValuesFromIntent);

        // Get datachannel options
        boolean dataChannelEnabled = sharedPrefGetBoolean(R.string.pref_enable_datachannel_key,
                CallActivity.EXTRA_DATA_CHANNEL_ENABLED, R.string.pref_enable_datachannel_default,
                useValuesFromIntent);
        boolean ordered = sharedPrefGetBoolean(R.string.pref_ordered_key, CallActivity.EXTRA_ORDERED,
                R.string.pref_ordered_default, useValuesFromIntent);
        boolean negotiated = sharedPrefGetBoolean(R.string.pref_negotiated_key,
                CallActivity.EXTRA_NEGOTIATED, R.string.pref_negotiated_default, useValuesFromIntent);
        int maxRetrMs = sharedPrefGetInteger(R.string.pref_max_retransmit_time_ms_key,
                CallActivity.EXTRA_MAX_RETRANSMITS_MS, R.string.pref_max_retransmit_time_ms_default,
                useValuesFromIntent);
        int maxRetr =
                sharedPrefGetInteger(R.string.pref_max_retransmits_key, CallActivity.EXTRA_MAX_RETRANSMITS,
                        R.string.pref_max_retransmits_default, useValuesFromIntent);
        int id = sharedPrefGetInteger(R.string.pref_data_id_key, CallActivity.EXTRA_ID,
                R.string.pref_data_id_default, useValuesFromIntent);
        String protocol = sharedPrefGetString(R.string.pref_data_protocol_key,
                CallActivity.EXTRA_PROTOCOL, R.string.pref_data_protocol_default, useValuesFromIntent);


        intent.putExtra(CallActivity.EXTRA_LOOPBACK, false);
        intent.putExtra(CallActivity.EXTRA_VIDEO_CALL, videoCallEnabled);
        intent.putExtra(CallActivity.EXTRA_SCREENCAPTURE, useScreencapture);
        intent.putExtra(CallActivity.EXTRA_CAMERA2, useCamera2);
        intent.putExtra(CallActivity.EXTRA_VIDEO_WIDTH, videoWidth);
        intent.putExtra(CallActivity.EXTRA_VIDEO_HEIGHT, videoHeight);
        intent.putExtra(CallActivity.EXTRA_VIDEO_FPS, cameraFps);
        intent.putExtra(CallActivity.EXTRA_VIDEO_CAPTUREQUALITYSLIDER_ENABLED, captureQualitySlider);
        intent.putExtra(CallActivity.EXTRA_VIDEO_BITRATE, videoStartBitrate);
        intent.putExtra(CallActivity.EXTRA_VIDEOCODEC, videoCodec);
        intent.putExtra(CallActivity.EXTRA_HWCODEC_ENABLED, hwCodec);
        intent.putExtra(CallActivity.EXTRA_CAPTURETOTEXTURE_ENABLED, captureToTexture);
        intent.putExtra(CallActivity.EXTRA_FLEXFEC_ENABLED, flexfecEnabled);
        intent.putExtra(CallActivity.EXTRA_NOAUDIOPROCESSING_ENABLED, noAudioProcessing);
        intent.putExtra(CallActivity.EXTRA_AECDUMP_ENABLED, aecDump);
        intent.putExtra(CallActivity.EXTRA_OPENSLES_ENABLED, useOpenSLES);
        intent.putExtra(CallActivity.EXTRA_DISABLE_BUILT_IN_AEC, disableBuiltInAEC);
        intent.putExtra(CallActivity.EXTRA_DISABLE_BUILT_IN_AGC, disableBuiltInAGC);
        intent.putExtra(CallActivity.EXTRA_DISABLE_BUILT_IN_NS, disableBuiltInNS);
        intent.putExtra(CallActivity.EXTRA_ENABLE_LEVEL_CONTROL, enableLevelControl);
        intent.putExtra(CallActivity.EXTRA_DISABLE_WEBRTC_AGC_AND_HPF, disableWebRtcAGCAndHPF);
        intent.putExtra(CallActivity.EXTRA_AUDIO_BITRATE, audioStartBitrate);
        intent.putExtra(CallActivity.EXTRA_AUDIOCODEC, audioCodec);
        intent.putExtra(CallActivity.EXTRA_DISPLAY_HUD, displayHud);
        intent.putExtra(CallActivity.EXTRA_TRACING, tracing);
        intent.putExtra(CallActivity.EXTRA_CMDLINE, false);
        intent.putExtra(CallActivity.EXTRA_RUNTIME, 0);


        startActivityForResult(intent, CONNECTION_REQUEST);
    }

    /**
     * Create a private room
     */
    private void launchPrivateRoom() {

        String roomName = etRoomName.getText().toString();

        visioOwner = true; // The current user has initiated the visio

        Log.d("tvRoomName", roomName);

        createRoomInput input = RoomObjectFactory.createcreateRoomInput();
        input.setName(roomName);

        String[] memberList = new String[]{userId};
        input.setMembers(Arrays.asList(memberList));

        // Call createRoom
        Future<createRoomCompletion> crc = futureApi.createRoom(input);
        try {
            createRoomOutput cro = crc.get().getResult();
            //asyncApi.createRoom(input);
            Log.d("createRoom", "createRoomCompletion ");
            Log.d("roomId", cro.getRoom().getId());
            roomId = cro.getRoom().getId();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        // Invite user to join the room
        targetId = UserIdWebDamien;

    }

    /**
     * Launch the call for a public room
     */
    private void launchPublicRoom() {
        publicRoomName = etRoomName.getText().toString();
        inviteId = "";
        roomId = "";
        launchVisioActivity();
    }


    /**
     * Get a value from the shared preference or from the intent, if it does not
     * exist the default is used.
     */
    private String sharedPrefGetString(
            int attributeId, String intentName, int defaultId, boolean useFromIntent) {
        String defaultValue = getString(defaultId);
        if (useFromIntent) {
            String value = getIntent().getStringExtra(intentName);
            if (value != null) {
                return value;
            }
            return defaultValue;
        } else {
            String attributeName = getString(attributeId);
            return sharedPref.getString(attributeName, defaultValue);
        }
    }

    /**
     * Get a value from the shared preference or from the intent, if it does not
     * exist the default is used.
     */
    private boolean sharedPrefGetBoolean(
            int attributeId, String intentName, int defaultId, boolean useFromIntent) {
        boolean defaultValue = Boolean.valueOf(getString(defaultId));
        if (useFromIntent) {
            return getIntent().getBooleanExtra(intentName, defaultValue);
        } else {
            String attributeName = getString(attributeId);
            return sharedPref.getBoolean(attributeName, defaultValue);
        }
    }

    /**
     * Get a value from the shared preference or from the intent, if it does not
     * exist the default is used.
     */
    private int sharedPrefGetInteger(
            int attributeId, String intentName, int defaultId, boolean useFromIntent) {
        String defaultString = getString(defaultId);
        int defaultValue = Integer.parseInt(defaultString);
        if (useFromIntent) {
            return getIntent().getIntExtra(intentName, defaultValue);
        } else {
            String attributeName = getString(attributeId);
            String value = sharedPref.getString(attributeName, defaultString);
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                Log.e(TAG, "Wrong setting for: " + attributeName + ":" + value);
                return defaultValue;
            }
        }
    }

    @Override
    protected void onServiceAttached(ZetaPushService service) {
        // do something necessary by its subclass.
        Log.d(TAG, "onServiceAttached");
        zetapushClient = service.getZetaPushClient();
        userId = zetapushClient.getUserId();

        new Thread() {
            public void run() {
                try {
                    // TODO - Do I have to create it each time the service is connected ?
                    futureApi = VisioFutureApi.Factory.createService(zetapushClient, "macro_0");
                    VisioAsyncApiListener.Factory.registerListener(ZetapushConnectActivity.this, zetapushClient, "macro_0");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }

    @Override
    protected void onServiceDetached() {
        Log.d(TAG, "onServiceDetached");
        new Thread() {
            public void run() {
                try {
                    VisioAsyncApiListener.Factory.unregisterListener(ZetapushConnectActivity.this, zetapushClient);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    public void acceptRoomInvitation(acceptRoomInvitationCompletion notification) {

    }

    @Override
    public void addGroupMember(addGroupMemberCompletion notification) {

    }

    @Override
    public void addRoomMember(addRoomMemberCompletion notification) {

    }

    @Override
    public void addRoomMessage(addRoomMessageCompletion notification) {

    }

    @Override
    public void addToMissedCall(addToMissedCallCompletion notification) {

    }

    @Override
    public void callGroup(callGroupCompletion notification) {

    }

    @Override
    public void confirmFileUpload(confirmFileUploadCompletion notification) {

    }

    @Override
    public void confirmUserPassword(confirmUserPasswordCompletion notification) {

    }

    @Override
    public void createGroup(createGroupCompletion notification) {

    }

    @Override
    public void createOneToOneRoom(createOneToOneRoomCompletion notification) {

    }

    @Override
    public void createOrJoinPublicRoom(createOrJoinPublicRoomCompletion notification) {

    }

    @Override
    public void createRoom(createRoomCompletion notification) {

    }

    @Override
    public void createRoomInvitation(createRoomInvitationCompletion notification) {

    }

    @Override
    public void createRoomMemberInvitation(createRoomMemberInvitationCompletion notification) {
        Log.d("listener", "createRoomMemberInvitation " + notification.getResult().toString());
        roomId = notification.getResult().getRoom().getId();
        inviteId = notification.getResult().getInvitation().getId();
        targetId = notification.getResult().getInvitation().getOwner();
        visioOwner = false;
    }

    @Override
    public void createUser(createUserCompletion notification) {

    }

    @Override
    public void deleteFileEntry(deleteFileEntryCompletion notification) {

    }

    @Override
    public void deleteGroup(deleteGroupCompletion notification) {

    }

    @Override
    public void getCurrentCallByUser(getCurrentCallByUserCompletion notification) {

    }

    @Override
    public void getFileEntry(getFileEntryCompletion notification) {

    }

    @Override
    public void getFileEntryList(getFileEntryListCompletion notification) {

    }

    @Override
    public void getGroup(getGroupCompletion notification) {

    }

    @Override
    public void getGroupList(getGroupListCompletion notification) {

    }

    @Override
    public void getMetadata(getMetadataCompletion notification) {

    }

    @Override
    public void getMissedCallByUser(getMissedCallByUserCompletion notification) {

    }

    @Override
    public void getRoom(getRoomCompletion notification) {

    }

    @Override
    public void getRoomMessage(getRoomMessageCompletion notification) {

    }

    @Override
    public void getRoomMessageList(getRoomMessageListCompletion notification) {

    }

    @Override
    public void getTags(getTagsCompletion notification) {

    }

    @Override
    public void getTargets(getTargetsCompletion notification) {

    }

    @Override
    public void getUser(getUserCompletion notification) {

    }

    @Override
    public void getUserByLogin(getUserByLoginCompletion notification) {

    }

    @Override
    public void getUserGroupList(getUserGroupListCompletion notification) {

    }

    @Override
    public void getUserList(getUserListCompletion notification) {

    }

    @Override
    public void getUserRoomList(getUserRoomListCompletion notification) {

    }

    @Override
    public void isMemberOf(isMemberOfCompletion notification) {

    }

    @Override
    public void leavePublicRoom(leavePublicRoomCompletion notification) {

    }

    @Override
    public void purgeRoomMessageList(purgeRoomMessageListCompletion notification) {

    }

    @Override
    public void removeGroupMember(removeGroupMemberCompletion notification) {

    }

    @Override
    public void removeMetadata(removeMetadataCompletion notification) {

    }

    @Override
    public void removeRoomMember(removeRoomMemberCompletion notification) {

    }

    @Override
    public void removeTags(removeTagsCompletion notification) {

    }

    @Override
    public void removeTargets(removeTargetsCompletion notification) {

    }

    @Override
    public void requestFileUpload(requestFileUploadCompletion notification) {

    }

    @Override
    public void resetUserPassword(resetUserPasswordCompletion notification) {

    }

    @Override
    public void resetUserPasswordByLogin(resetUserPasswordByLoginCompletion notification) {

    }

    @Override
    public void sendRoomMessageToMember(sendRoomMessageToMemberCompletion notification) {

    }

    @Override
    public void setCallAccepted(setCallAcceptedCompletion notification) {

    }

    @Override
    public void setCallRefused(setCallRefusedCompletion notification) {

    }

    @Override
    public void setCallTerminated(setCallTerminatedCompletion notification) {

    }

    @Override
    public void setMetadata(setMetadataCompletion notification) {

    }

    @Override
    public void setTags(setTagsCompletion notification) {

    }

    @Override
    public void setTargets(setTargetsCompletion notification) {

    }

    @Override
    public void timeoutCall(timeoutCallCompletion notification) {

    }

    @Override
    public void updateRoomMessageByService(updateRoomMessageByServiceCompletion notification) {

    }

    @Override
    public void updateUser(updateUserCompletion notification) {

    }

    @Override
    public void updateUserAvatar(updateUserAvatarCompletion notification) {

    }

    /**
     * ZetaPush Connection Listener
     */

    @Override
    public void successfulHandshake(Map<String, Object> map) {
        Log.d("YEAAAAAHHHH", map.toString());
    }

    @Override
    public void failedHandshake(Map<String, Object> map) {

    }

    @Override
    public void connectionEstablished() {
        Log.d(TAG, "connectionEstablished");
    }

    @Override
    public void connectionBroken() {
        Log.d(TAG, "connectionBroken");
    }

    @Override
    public void connectionClosed() {
        Log.d(TAG, "connectionClosed");
    }

    @Override
    public void messageLost(String s, Object o) {

    }
}
