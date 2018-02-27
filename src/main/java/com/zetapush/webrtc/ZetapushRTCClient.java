package com.zetapush.webrtc;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

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
import com.zetapush.core.room.Room;
import com.zetapush.core.room.RoomInvitation;
import com.zetapush.core.room.RoomObjectFactory;
import com.zetapush.core.room.acceptRoomInvitationCompletion;
import com.zetapush.core.room.acceptRoomInvitationInput;
import com.zetapush.core.room.acceptRoomInvitationOutput;
import com.zetapush.core.room.addRoomMemberCompletion;
import com.zetapush.core.room.addRoomMessageCompletion;
import com.zetapush.core.room.createOneToOneRoomCompletion;
import com.zetapush.core.room.createOrJoinPublicRoomCompletion;
import com.zetapush.core.room.createOrJoinPublicRoomInput;
import com.zetapush.core.room.createOrJoinPublicRoomOutput;
import com.zetapush.core.room.createRoomCompletion;
import com.zetapush.core.room.createRoomInvitationCompletion;
import com.zetapush.core.room.createRoomMemberInvitationCompletion;
import com.zetapush.core.room.createRoomMemberInvitationInput;
import com.zetapush.core.room.getRoomCompletion;
import com.zetapush.core.room.getRoomMessageCompletion;
import com.zetapush.core.room.getRoomMessageListCompletion;
import com.zetapush.core.room.getUserRoomListCompletion;
import com.zetapush.core.room.leavePublicRoomCompletion;
import com.zetapush.core.room.leavePublicRoomInput;
import com.zetapush.core.room.purgeRoomMessageListCompletion;
import com.zetapush.core.room.removeRoomMemberCompletion;
import com.zetapush.core.room.sendRoomMessageToMemberCompletion;
import com.zetapush.core.room.sendRoomMessageToMemberInput;
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
import com.zetapush.visio.VisioAsyncApi;
import com.zetapush.visio.VisioAsyncApiListener;
import com.zetapush.visio.VisioFutureApi;

import org.appspot.apprtc.AppRTCClient;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static com.zetapush.webrtc.ZetapushRTCClient.RoomConnection.PUBLIC_ROOM_JOIN;

/**
 * Created by mikaelmorvan on 18/01/2018.
 */

public class ZetapushRTCClient implements AppRTCClient, VisioAsyncApiListener {

    public enum RoomConnection {
        PRIVATE_ROOM_OWNER,
        PRIVATE_ROOM_JOIN,
        PUBLIC_ROOM_JOIN
    }

    private static final String TAG = "ZetapushRTCClient";
    private VisioFutureApi futureApi;
    private VisioAsyncApi asyncApi;
    private ZetapushClient zetapushClient;
    private String userId;
    private String targetId;
    private String roomId;
    private String inviteId;
    private String publicRoomName;
    private Room room;
    private RoomConnection roomConnection;
    private boolean initiator = false;
    private SignalingEvents events;
    private final Handler handler;
    private RoomConnectionParameters connectionParameters;

    private ArrayList<PeerConnection.IceServer> iceServers = new ArrayList<>();

    public ZetapushRTCClient(SignalingEvents events) {
        this.events = events;
        final HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        handler = new Handler(handlerThread.getLooper());

        iceServers.add(new PeerConnection.IceServer("stun:turn.zpush.io:443", "lesateliers", "c4878XzgQ54NhjsSNX"));
        iceServers.add(new PeerConnection.IceServer("turn:turn.zpush.io:443?transport=udp", "lesateliers", "c4878XzgQ54NhjsSNX"));
        iceServers.add(new PeerConnection.IceServer("turn:turn.zpush.io:443?transport=tcp", "lesateliers", "c4878XzgQ54NhjsSNX"));

    }

    public void Init(final ZetapushClient zetapushClient, String roomId, String targetId, String inviteId, String publicRoomName, RoomConnection roomConnection) {
        this.zetapushClient = zetapushClient;
        this.userId = zetapushClient.getUserId();
        this.roomId = roomId;
        this.targetId = targetId;
        this.inviteId = inviteId;
        this.roomConnection = roomConnection;
        this.publicRoomName = publicRoomName;

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                futureApi = VisioFutureApi.Factory.createService(zetapushClient, "macro_0");
                asyncApi = VisioAsyncApi.Factory.createService(zetapushClient, "macro_0");
                VisioAsyncApiListener.Factory.registerListener(ZetapushRTCClient.this, zetapushClient, "macro_0");
            }
        });

        t.start(); // spawn thread
        // Wait till the initialization is done
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        events.onRTCClientReady();

    }

    public void DeInit(final ZetapushClient zetapushClient) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "unregisterListener");
                VisioAsyncApiListener.Factory.unregisterListener(ZetapushRTCClient.this, zetapushClient);
            }
        });

        t.start(); // spawn thread
        // Wait till the initialization is done
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void InviteTargetUser() {
        this.initiator = true;
        createRoomMemberInvitationInput crmiInput = RoomObjectFactory.createcreateRoomMemberInvitationInput();
        crmiInput.setGuest(targetId);
        crmiInput.setId(roomId);
        Future<createRoomMemberInvitationCompletion> crmi = futureApi.createRoomMemberInvitation(crmiInput);
        try {
            RoomInvitation ri = crmi.get().getResult();
            this.room = ri.getRoom();
            Log.d("futureApi", "createRoomMemberInvitation done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private void AcceptInvitation() {
        this.initiator = false;
        // Accept the invitation
        acceptRoomInvitationInput input = RoomObjectFactory.createacceptRoomInvitationInput();
        input.setInvitationId(inviteId);
        input.setRoomId(roomId);
        input.setOwner(targetId);

        // Call acceptRoomInvitation
        // The call will add us to the current room and will call addRoomMember
        Future<acceptRoomInvitationCompletion> ari = futureApi.acceptRoomInvitation(input);
        try {
            acceptRoomInvitationOutput ario = ari.get().getResult();
            this.room = ario.getRoom();
            Log.d("future", "acceptRoomInvitation ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create or join a public Room
     */
    private void JoinPublicRoom(){
        this.initiator = false;
        targetId = "";

        createOrJoinPublicRoomInput input = RoomObjectFactory.createcreateOrJoinPublicRoomInput(this.publicRoomName);

        // Call createRoom
        Future<createOrJoinPublicRoomCompletion> crc = futureApi.createOrJoinPublicRoom(input);
        try {
            createOrJoinPublicRoomOutput cjpro = crc.get().getResult();
            //asyncApi.createRoom(input);
            Log.d(TAG, "createPublicRoomCompletion ");
            Log.d(TAG, "room " + cjpro.getRoom().toString());
            roomId = cjpro.getRoom().getId();
            this.room = cjpro.getRoom();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void connectToRoom(RoomConnectionParameters connectionParameters) {
        this.connectionParameters = connectionParameters;

        switch (this.roomConnection)
        {
            case PRIVATE_ROOM_JOIN:
                AcceptInvitation();
                break;
            case PRIVATE_ROOM_OWNER:
                InviteTargetUser();
                break;
            case PUBLIC_ROOM_JOIN:
                JoinPublicRoom();
                break;
        }

    }

    @Override
    public void sendOfferSdp(SessionDescription sdp) {
        Log.d(TAG, " ==== = ===== ==== ======= ====== sendOfferSdp");
        sendRoomMessageToMemberInput srmtmi = RoomObjectFactory.createsendRoomMessageToMemberInput();
        srmtmi.setRoom(this.room);
        srmtmi.setMember(this.targetId);
        srmtmi.setType("data");

        HashMap<String, Object> metadataIce = new HashMap<>();
        metadataIce.put("type", "offer");
        srmtmi.setMetadata(metadataIce);

        HashMap<String, Object> hm = new HashMap<>();
        hm.put("description", sdp.description);
        hm.put("type", "offer");
        srmtmi.setValue(hm);
        asyncApi.sendRoomMessageToMember(srmtmi);

        /*
        if (connectionParameters.loopback) {
            // In loopback mode rename this offer to answer and route it back.
            SessionDescription sdpAnswer = new SessionDescription(
                    SessionDescription.Type.fromCanonicalForm("answer"), sdp.description);
            events.onRemoteDescription(sdpAnswer);
        }
        */
    }

    @Override
    public void sendAnswerSdp(SessionDescription sdp) {
        Log.d(TAG, " ==== = ===== ==== ======= ====== sendAnswerSdp");
        /*
        if (connectionParameters.loopback) {
            Log.e(TAG, "Sending answer in loopback mode.");
            return;
        }
        */
        sendRoomMessageToMemberInput srmtmi = RoomObjectFactory.createsendRoomMessageToMemberInput();
        srmtmi.setRoom(this.room);
        srmtmi.setMember(this.targetId);
        srmtmi.setType("data");

        HashMap<String, Object> metadataIce = new HashMap<>();
        metadataIce.put("type", "answer");
        srmtmi.setMetadata(metadataIce);

        HashMap<String, Object> hm = new HashMap<>();
        hm.put("description", sdp.description);
        hm.put("type", "answer");
        srmtmi.setValue(hm);
        asyncApi.sendRoomMessageToMember(srmtmi);

    }

    @Override
    public void sendLocalIceCandidate(IceCandidate candidate) {
        Log.d(TAG, " ==== = ===== ==== ======= ====== sendLocalIceCandidate");
        sendRoomMessageToMemberInput srmtmi = RoomObjectFactory.createsendRoomMessageToMemberInput();
        srmtmi.setRoom(this.room);
        srmtmi.setMember(this.targetId);
        srmtmi.setType("data");

        HashMap<String, Object> metadataIce = new HashMap<>();
        metadataIce.put("type", "icecandidate");
        srmtmi.setMetadata(metadataIce);

        HashMap<String, Object> hm = new HashMap<>();
        hm.put("type", "icecandidate");
        hm.put("sdpMLineIndex", candidate.sdpMLineIndex);
        hm.put("sdpMid", candidate.sdpMid);
        hm.put("candidate", candidate.sdp);
        srmtmi.setValue(hm);

        asyncApi.sendRoomMessageToMember(srmtmi);
    }

    @Override
    public void sendLocalIceCandidateRemovals(IceCandidate[] candidates) {
        sendRoomMessageToMemberInput srmtmi = RoomObjectFactory.createsendRoomMessageToMemberInput();
        srmtmi.setRoom(this.room);
        srmtmi.setMember(this.targetId);
        srmtmi.setType("data");

        HashMap<String, Object> metadataIce = new HashMap<>();
        metadataIce.put("type", "remove-candidates");
        srmtmi.setMetadata(metadataIce);

        HashMap<String, Object> hm = new HashMap<>();
        hm.put("type", "remove-candidates");
        List<Object> cl = new ArrayList<Object>();
        for (final IceCandidate candidate : candidates) {
            cl.add(toJsonCandidate(candidate));
        }
        hm.put("candidates", cl);
        srmtmi.setValue(hm);
        asyncApi.sendRoomMessageToMember(srmtmi);

    }

    // Converts a Java candidate to a JSONObject.
    private Map<String, Object> toJsonCandidate(final IceCandidate candidate) {
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("sdpMLineIndex", candidate.sdpMLineIndex);
        hm.put("sdpMid", candidate.sdpMid);
        hm.put("candidate", candidate.sdp);
        return hm;
    }

    private void reportError(final String errorMessage) {
        Log.e(TAG, errorMessage);
        handler.post(new Runnable() {
            @Override
            public void run() {
                events.onChannelError(errorMessage);
            }
        });
    }

    // Converts a JSON candidate to a Java object.
    private IceCandidate toJavaCandidate(Map<String, Object> map) {
        return new IceCandidate(
                (String) map.get("sdpMid"), (Integer) map.get("sdpMLineIndex"), (String) map.get("candidate"));
    }

    @Override
    public void disconnectFromRoom() {
        //
        if (this.roomConnection == PUBLIC_ROOM_JOIN ){
            leavePublicRoomInput input = RoomObjectFactory.createleavePublicRoomInput(this.publicRoomName);
            asyncApi.leavePublicRoom(input);
        }
    }

    /****************************************
     * ZetaPush listeners
     ****************************************/

    @Override
    public void acceptRoomInvitation(acceptRoomInvitationCompletion notification) {

    }

    @Override
    public void addGroupMember(addGroupMemberCompletion notification) {

    }

    @Override
    public void addRoomMember(addRoomMemberCompletion notification) {
        // A new user has joined the room
        // Let's start the Webrtc Danse !
        Log.d(TAG, "addRoomMember " + notification.getResult().toString());

        String member = notification.getResult().getMember();
        //if (member != userId) {
        Log.d(TAG, "addRoomMember create signalingParameters " + member);
        SignalingParameters sp = new SignalingParameters(iceServers, initiator, userId, "", "", null, null);
        events.onConnectedToRoom(sp);
        //}
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

        // A new user has joined the room
        // Let's start the Webrtc Danse !
        Log.d(TAG, "createOrJoinPublicRoom " + notification.getResult().toString());

        this.room = notification.getResult().getRoom();
        String member = notification.getResult().getMember();
        Log.d(TAG, "userId " + userId);
        if (! member.equals(userId)) {
            this.targetId = member;
            // A use joins the room
            this.initiator = true; // IMPORTANT !
            Log.d(TAG, "addRoomMember create signalingParameters " + member);

        } else {
            this.initiator = false;
        }

        SignalingParameters sp = new SignalingParameters(iceServers, initiator, userId, "", "", null, null);
        events.onConnectedToRoom(sp);

    }

    @Override
    public void createRoom(createRoomCompletion notification) {

    }

    @Override
    public void createRoomInvitation(createRoomInvitationCompletion notification) {

    }

    @Override
    public void createRoomMemberInvitation(createRoomMemberInvitationCompletion notification) {

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
        // A message has arrived
        Log.d(TAG, "<<<<<<  sendRoomMessageToMember ");

        Map<String, Object> metadata = notification.getResult().getMessage().getMetadata();
        String typeMessage = (String) metadata.get("type");
        Map<String, Object> data = notification.getResult().getMessage().getValue();
        //String target = notification.getResult().getMessage().getAuthor();
        this.targetId = notification.getResult().getMessage().getAuthor();

        try {

            Log.d(TAG, "<<<<<<  sendRoomMessageToMember typeMessage " + typeMessage);
            Log.d(TAG, "<<<<<<  sendRoomMessageToMember data " + data.toString());

            if (typeMessage.equals("icecandidate")) {
                events.onRemoteIceCandidate(toJavaCandidate(data));
            } else if (typeMessage.equals("remove-candidates")) {
                List<Object> lc = (List<Object>) data.get("candidates");

                IceCandidate[] candidates = new IceCandidate[lc.size()];
                for (int i = 0; i < lc.size(); ++i) {
                    candidates[i] = toJavaCandidate((Map<String, Object>) lc.get(i));
                }
                events.onRemoteIceCandidatesRemoved(candidates);
            } else if (typeMessage.equals("answer")) {
                if (initiator) {
                    SessionDescription sdp = new SessionDescription(
                            SessionDescription.Type.fromCanonicalForm(typeMessage), (String) data.get("description"));
                    events.onRemoteDescription(sdp);
                } else {
                    reportError("Received answer for call initiator: " + data.toString());
                }
            } else if (typeMessage.equals("offer")) {
                if (!initiator) {
                    SessionDescription sdp = new SessionDescription(
                            SessionDescription.Type.fromCanonicalForm(typeMessage), (String) data.get("description"));
                    events.onRemoteDescription(sdp);
                } else {
                    reportError("Received offer for call receiver: " + data.toString());
                }
            } else if (typeMessage.equals("bye")) {
                events.onChannelClose();
            } else {
                reportError("Unexpected WebSocket message: " + data.toString());
            }
        } catch (Exception e) {
            Log.e("ERROR", e.toString());
            Log.e(TAG, "sendRoomMessageToMember " + notification.getResult().toString());
        }
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
}
