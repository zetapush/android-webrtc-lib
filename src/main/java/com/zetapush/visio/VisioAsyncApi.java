package com.zetapush.visio;

import com.zetapush.client.highlevel.ZetapushClient;
import com.zetapush.core.visio.addToMissedCallInput;
import com.zetapush.core.visio.callGroupInput;
import com.zetapush.core.visio.getCurrentCallByUserInput;
import com.zetapush.core.visio.getMissedCallByUserInput;
import com.zetapush.core.visio.setCallAcceptedInput;
import com.zetapush.core.visio.setCallRefusedInput;
import com.zetapush.core.visio.setCallTerminatedInput;
import com.zetapush.core.visio.timeoutCallInput;
import com.zetapush.core.file.confirmFileUploadInput;
import com.zetapush.core.file.deleteFileEntryInput;
import com.zetapush.core.file.getFileEntryInput;
import com.zetapush.core.file.getFileEntryListInput;
import com.zetapush.core.file.requestFileUploadInput;
import com.zetapush.core.group.addGroupMemberInput;
import com.zetapush.core.group.createGroupInput;
import com.zetapush.core.group.deleteGroupInput;
import com.zetapush.core.group.getGroupInput;
import com.zetapush.core.group.getGroupListInput;
import com.zetapush.core.group.getUserGroupListInput;
import com.zetapush.core.group.isMemberOfInput;
import com.zetapush.core.group.removeGroupMemberInput;
import com.zetapush.core.room.acceptRoomInvitationInput;
import com.zetapush.core.room.addRoomMemberInput;
import com.zetapush.core.room.addRoomMessageInput;
import com.zetapush.core.room.createOneToOneRoomInput;
import com.zetapush.core.room.createOrJoinPublicRoomInput;
import com.zetapush.core.room.createRoomInput;
import com.zetapush.core.room.createRoomInvitationInput;
import com.zetapush.core.room.createRoomMemberInvitationInput;
import com.zetapush.core.room.getRoomInput;
import com.zetapush.core.room.getRoomMessageInput;
import com.zetapush.core.room.getRoomMessageListInput;
import com.zetapush.core.room.getUserRoomListInput;
import com.zetapush.core.room.leavePublicRoomInput;
import com.zetapush.core.room.purgeRoomMessageListInput;
import com.zetapush.core.room.removeRoomMemberInput;
import com.zetapush.core.room.sendRoomMessageToMemberInput;
import com.zetapush.core.room.updateRoomMessageByServiceInput;
import com.zetapush.core.user.confirmUserPasswordInput;
import com.zetapush.core.user.createUserInput;
import com.zetapush.core.user.getUserByLoginInput;
import com.zetapush.core.user.getUserInput;
import com.zetapush.core.user.getUserListInput;
import com.zetapush.core.user.resetUserPasswordByLoginInput;
import com.zetapush.core.user.resetUserPasswordInput;
import com.zetapush.core.user.updateUserAvatarInput;
import com.zetapush.core.user.updateUserInput;
import com.zetapush.core.utils.getMetadataInput;
import com.zetapush.core.utils.getTagsInput;
import com.zetapush.core.utils.getTargetsInput;
import com.zetapush.core.utils.removeMetadataInput;
import com.zetapush.core.utils.removeTagsInput;
import com.zetapush.core.utils.removeTargetsInput;
import com.zetapush.core.utils.setMetadataInput;
import com.zetapush.core.utils.setTagsInput;
import com.zetapush.core.utils.setTargetsInput;

public interface VisioAsyncApi {
/**
 * Accept Room Invitation
 */
	void acceptRoomInvitation(acceptRoomInvitationInput parameters);

/**
 * Add user in a group
 */
	void addGroupMember(addGroupMemberInput parameters);

/**
 *
 */
	void addRoomMember(addRoomMemberInput parameters);

/**
 *
 */
	void addRoomMessage(addRoomMessageInput parameters);

/** 
 *	Macroscript that used to send the call object as a missed call.
 *	The client need to listen this macroscript to handle missed calls
 */
	void addToMissedCall(addToMissedCallInput parameters);

/**
 *	Macrosript used to send a call to a group
 */
	void callGroup(callGroupInput parameters);

/**
 *
 */
	void confirmFileUpload(confirmFileUploadInput parameters);

/**
 * Confirm the new user password.
 * Token and password are required, token can be retreived via a call on resetUserPassword macro
 */
	void confirmUserPassword(confirmUserPasswordInput parameters);

/**
 * Create a group
 */
	void createGroup(createGroupInput parameters);

/**
 *
 */
	void createOneToOneRoom(createOneToOneRoomInput parameters);

/**
 * Create a room with the global owner user
 */
	void createOrJoinPublicRoom(createOrJoinPublicRoomInput parameters);

/**
 *
 */
	void createRoom(createRoomInput parameters);

/**
 *
 */
	void createRoomInvitation(createRoomInvitationInput parameters);

/**
 *
 */
	void createRoomMemberInvitation(createRoomMemberInvitationInput parameters);

/**
 * Create a new ZetaPush with a credentials based authentication
 * User profile can be customized with the followings config variables:
 * <ul>
 *	<li><strong>@config.authentication.simple.mandatory_fields</strong> Add mandatory fields to user profile (default is email)</li>
 *	<li><strong>@config.authentication.simple.public_fields</strong> Add public fields to user profile (defaults are email,firstname,lastname,mobilenumber,phonenumber,birthday,avatar,biography)</li>
 * </ul>
 */
	void createUser(createUserInput parameters);

/**
 *
 */
	void deleteFileEntry(deleteFileEntryInput parameters);

/**
 * Delete a group
 */
	void deleteGroup(deleteGroupInput parameters);

/**
 *	Get the list of in progress call by user
 */
	void getCurrentCallByUser(getCurrentCallByUserInput parameters);

/**
 *
 */
	void getFileEntry(getFileEntryInput parameters);

/**
 *
 */
	void getFileEntryList(getFileEntryListInput parameters);

/**
 * Get a group
 */
	void getGroup(getGroupInput parameters);

/**
 * Get all user groups
 */
	void getGroupList(getGroupListInput parameters);

/**
 * Get metadata
 */
	void getMetadata(getMetadataInput parameters);

/**
 *	Get the list of missed call by user
 */
	void getMissedCallByUser(getMissedCallByUserInput parameters);

/**
 *
 */
	void getRoom(getRoomInput parameters);

/**
 *
 */
	void getRoomMessage(getRoomMessageInput parameters);

/**
 *
 */
	void getRoomMessageList(getRoomMessageListInput parameters);

/**
 *
 */
	void getTags(getTagsInput parameters);

/**
 * Get targets associated to a specific id
 * Targets represent a list of string (group id or user key) 
 */
	void getTargets(getTargetsInput parameters);

/**
 * Get user profile according to the given user key
 * <strong>UserKey is not the login used to connect the user</strong>
 * To get a user profile based on the login value, you have to call <a href="./getUserbyLogin.html">getUserbyLogin()</a>
 * User Key is the uniq key associted to each ZetaPush user. You can acces to this value with special keyword <strong>__userKey</strong>
 */
	void getUser(getUserInput parameters);

/**
 * Get user profile according to the login use to connect the user
 * <strong>Login is not the user key of the user</strong>
 */
	void getUserByLogin(getUserByLoginInput parameters);

/**
 * Get all the groups user is part of
 */
	void getUserGroupList(getUserGroupListInput parameters);

/**
 * Get list of users according to user keys list
 * Returned list wrap user profile in a ad hoc data structure
 * <pre><code>
 * class UserWrapper {
 *   boolean found;
 *   User user;
 * }
 * </code></pre>
 */
	void getUserList(getUserListInput parameters);

/**
 *
 */
	void getUserRoomList(getUserRoomListInput parameters);

/**
 * Test membership for current user for a group id and owner
 */
	void isMemberOf(isMemberOfInput parameters);

/**
 * Create a room with the global owner user
 */
	void leavePublicRoom(leavePublicRoomInput parameters);

/**
 *
 */
	void purgeRoomMessageList(purgeRoomMessageListInput parameters);

/**
 * Remove user from a group
 */
	void removeGroupMember(removeGroupMemberInput parameters);

/**
 * Remove metadata
 */
	void removeMetadata(removeMetadataInput parameters);

/**
 *
 */
	void removeRoomMember(removeRoomMemberInput parameters);

/**
 * Remove tags
 */
	void removeTags(removeTagsInput parameters);

/**
 * Remove targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */
	void removeTargets(removeTargetsInput parameters);

/**
 *
 */
	void requestFileUpload(requestFileUploadInput parameters);

	void resetUserPassword(resetUserPasswordInput parameters);

	void resetUserPasswordByLogin(resetUserPasswordByLoginInput parameters);

/**
 *
 */
	void sendRoomMessageToMember(sendRoomMessageToMemberInput parameters);

/** 
 *	Macroscript called when the call is accepted.
 *	We change the state of the call in the database
 */
	void setCallAccepted(setCallAcceptedInput parameters);

/** 
 *	Macroscript called when the call is refused.
 *	We change the state of the call in the database
 */
	void setCallRefused(setCallRefusedInput parameters);

/** 
 *	Macroscript called when the call is terminated.
 *	We change the state of the call in the database
 */
	void setCallTerminated(setCallTerminatedInput parameters);

/**
 * Set metadata
 */
	void setMetadata(setMetadataInput parameters);

/**
 *
 */
	void setTags(setTagsInput parameters);

/**
 * Define targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */
	void setTargets(setTargetsInput parameters);

/**
 *	Macroscript called after the timeout.
 *	This timeout is used to simulate a call that is ringing on the device
 */
	void timeoutCall(timeoutCallInput parameters);

/**
 *
 */
	void updateRoomMessageByService(updateRoomMessageByServiceInput parameters);

/**
 * Update user profile
 * User profile can be customized with the followings config variables:
 * <ul>
 *	<li><strong>@config.authentication.simple.mandatory_fields</strong> Add mandatory fields to user profile (default is email)</li>
 *	<li><strong>@config.authentication.simple.public_fields</strong> Add public fields to user profile (defaults are email,firstname,lastname,mobilenumber,phonenumber,birthday,avatar,biography)</li>
 * </ul>
 */
	void updateUser(updateUserInput parameters);

/**
 * Set avatar in user profile
 */
	void updateUserAvatar(updateUserAvatarInput parameters);


	/** Entry point class */
	public static class Factory {
		/** Entry point */
		public static VisioAsyncApi createService(ZetapushClient client, String deploymentId) {
			return client.createMacroPublisher(VisioAsyncApi.class, deploymentId);
		}
	}
}
