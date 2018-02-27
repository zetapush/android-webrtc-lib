package com.zetapush.visio;

import com.zetapush.client.highlevel.ZetapushClient;
import com.zetapush.core.visio.addToMissedCallCompletion;
import com.zetapush.core.visio.addToMissedCallInput;
import com.zetapush.core.visio.callGroupCompletion;
import com.zetapush.core.visio.callGroupInput;
import com.zetapush.core.visio.getCurrentCallByUserCompletion;
import com.zetapush.core.visio.getCurrentCallByUserInput;
import com.zetapush.core.visio.getMissedCallByUserCompletion;
import com.zetapush.core.visio.getMissedCallByUserInput;
import com.zetapush.core.visio.setCallAcceptedCompletion;
import com.zetapush.core.visio.setCallAcceptedInput;
import com.zetapush.core.visio.setCallRefusedCompletion;
import com.zetapush.core.visio.setCallRefusedInput;
import com.zetapush.core.visio.setCallTerminatedCompletion;
import com.zetapush.core.visio.setCallTerminatedInput;
import com.zetapush.core.visio.timeoutCallCompletion;
import com.zetapush.core.visio.timeoutCallInput;
import com.zetapush.core.file.confirmFileUploadCompletion;
import com.zetapush.core.file.confirmFileUploadInput;
import com.zetapush.core.file.deleteFileEntryCompletion;
import com.zetapush.core.file.deleteFileEntryInput;
import com.zetapush.core.file.getFileEntryCompletion;
import com.zetapush.core.file.getFileEntryInput;
import com.zetapush.core.file.getFileEntryListCompletion;
import com.zetapush.core.file.getFileEntryListInput;
import com.zetapush.core.file.requestFileUploadCompletion;
import com.zetapush.core.file.requestFileUploadInput;
import com.zetapush.core.group.addGroupMemberCompletion;
import com.zetapush.core.group.addGroupMemberInput;
import com.zetapush.core.group.createGroupCompletion;
import com.zetapush.core.group.createGroupInput;
import com.zetapush.core.group.deleteGroupCompletion;
import com.zetapush.core.group.deleteGroupInput;
import com.zetapush.core.group.getGroupCompletion;
import com.zetapush.core.group.getGroupInput;
import com.zetapush.core.group.getGroupListCompletion;
import com.zetapush.core.group.getGroupListInput;
import com.zetapush.core.group.getUserGroupListCompletion;
import com.zetapush.core.group.getUserGroupListInput;
import com.zetapush.core.group.isMemberOfCompletion;
import com.zetapush.core.group.isMemberOfInput;
import com.zetapush.core.group.removeGroupMemberCompletion;
import com.zetapush.core.group.removeGroupMemberInput;
import com.zetapush.core.room.acceptRoomInvitationCompletion;
import com.zetapush.core.room.acceptRoomInvitationInput;
import com.zetapush.core.room.addRoomMemberCompletion;
import com.zetapush.core.room.addRoomMemberInput;
import com.zetapush.core.room.addRoomMessageCompletion;
import com.zetapush.core.room.addRoomMessageInput;
import com.zetapush.core.room.createOneToOneRoomCompletion;
import com.zetapush.core.room.createOneToOneRoomInput;
import com.zetapush.core.room.createOrJoinPublicRoomCompletion;
import com.zetapush.core.room.createOrJoinPublicRoomInput;
import com.zetapush.core.room.createRoomCompletion;
import com.zetapush.core.room.createRoomInput;
import com.zetapush.core.room.createRoomInvitationCompletion;
import com.zetapush.core.room.createRoomInvitationInput;
import com.zetapush.core.room.createRoomMemberInvitationCompletion;
import com.zetapush.core.room.createRoomMemberInvitationInput;
import com.zetapush.core.room.getRoomCompletion;
import com.zetapush.core.room.getRoomInput;
import com.zetapush.core.room.getRoomMessageCompletion;
import com.zetapush.core.room.getRoomMessageInput;
import com.zetapush.core.room.getRoomMessageListCompletion;
import com.zetapush.core.room.getRoomMessageListInput;
import com.zetapush.core.room.getUserRoomListCompletion;
import com.zetapush.core.room.getUserRoomListInput;
import com.zetapush.core.room.leavePublicRoomCompletion;
import com.zetapush.core.room.leavePublicRoomInput;
import com.zetapush.core.room.purgeRoomMessageListCompletion;
import com.zetapush.core.room.purgeRoomMessageListInput;
import com.zetapush.core.room.removeRoomMemberCompletion;
import com.zetapush.core.room.removeRoomMemberInput;
import com.zetapush.core.room.sendRoomMessageToMemberCompletion;
import com.zetapush.core.room.sendRoomMessageToMemberInput;
import com.zetapush.core.room.updateRoomMessageByServiceCompletion;
import com.zetapush.core.room.updateRoomMessageByServiceInput;
import com.zetapush.core.user.confirmUserPasswordCompletion;
import com.zetapush.core.user.confirmUserPasswordInput;
import com.zetapush.core.user.createUserCompletion;
import com.zetapush.core.user.createUserInput;
import com.zetapush.core.user.getUserByLoginCompletion;
import com.zetapush.core.user.getUserByLoginInput;
import com.zetapush.core.user.getUserCompletion;
import com.zetapush.core.user.getUserInput;
import com.zetapush.core.user.getUserListCompletion;
import com.zetapush.core.user.getUserListInput;
import com.zetapush.core.user.resetUserPasswordByLoginCompletion;
import com.zetapush.core.user.resetUserPasswordByLoginInput;
import com.zetapush.core.user.resetUserPasswordCompletion;
import com.zetapush.core.user.resetUserPasswordInput;
import com.zetapush.core.user.updateUserAvatarCompletion;
import com.zetapush.core.user.updateUserAvatarInput;
import com.zetapush.core.user.updateUserCompletion;
import com.zetapush.core.user.updateUserInput;
import com.zetapush.core.utils.getMetadataCompletion;
import com.zetapush.core.utils.getMetadataInput;
import com.zetapush.core.utils.getTagsCompletion;
import com.zetapush.core.utils.getTagsInput;
import com.zetapush.core.utils.getTargetsCompletion;
import com.zetapush.core.utils.getTargetsInput;
import com.zetapush.core.utils.removeMetadataCompletion;
import com.zetapush.core.utils.removeMetadataInput;
import com.zetapush.core.utils.removeTagsCompletion;
import com.zetapush.core.utils.removeTagsInput;
import com.zetapush.core.utils.removeTargetsCompletion;
import com.zetapush.core.utils.removeTargetsInput;
import com.zetapush.core.utils.setMetadataCompletion;
import com.zetapush.core.utils.setMetadataInput;
import com.zetapush.core.utils.setTagsCompletion;
import com.zetapush.core.utils.setTagsInput;
import com.zetapush.core.utils.setTargetsCompletion;
import com.zetapush.core.utils.setTargetsInput;

import java.util.concurrent.Future;

public interface VisioFutureApi {
/**
 * Accept Room Invitation
 */
	Future<acceptRoomInvitationCompletion> acceptRoomInvitation(acceptRoomInvitationInput input);

/**
 * Add user in a group
 */
	Future<addGroupMemberCompletion> addGroupMember(addGroupMemberInput input);

/**
 *
 */
	Future<addRoomMemberCompletion> addRoomMember(addRoomMemberInput input);

/**
 *
 */
	Future<addRoomMessageCompletion> addRoomMessage(addRoomMessageInput input);

/** 
 *	Macroscript that used to send the call object as a missed call.
 *	The client need to listen this macroscript to handle missed calls
 */
	Future<addToMissedCallCompletion> addToMissedCall(addToMissedCallInput input);

/**
 *	Macrosript used to send a call to a group
 */
	Future<callGroupCompletion> callGroup(callGroupInput input);

/**
 *
 */
	Future<confirmFileUploadCompletion> confirmFileUpload(confirmFileUploadInput input);

/**
 * Confirm the new user password.
 * Token and password are required, token can be retreived via a call on resetUserPassword macro
 */
	Future<confirmUserPasswordCompletion> confirmUserPassword(confirmUserPasswordInput input);

/**
 * Create a group
 */
	Future<createGroupCompletion> createGroup(createGroupInput input);

/**
 *
 */
	Future<createOneToOneRoomCompletion> createOneToOneRoom(createOneToOneRoomInput input);

/**
 * Create a room with the global owner user
 */
	Future<createOrJoinPublicRoomCompletion> createOrJoinPublicRoom(createOrJoinPublicRoomInput input);

/**
 *
 */
	Future<createRoomCompletion> createRoom(createRoomInput input);

/**
 *
 */
	Future<createRoomInvitationCompletion> createRoomInvitation(createRoomInvitationInput input);

/**
 *
 */
	Future<createRoomMemberInvitationCompletion> createRoomMemberInvitation(createRoomMemberInvitationInput input);

/**
 * Create a new ZetaPush with a credentials based authentication
 * User profile can be customized with the followings config variables:
 * <ul>
 *	<li><strong>@config.authentication.simple.mandatory_fields</strong> Add mandatory fields to user profile (default is email)</li>
 *	<li><strong>@config.authentication.simple.public_fields</strong> Add public fields to user profile (defaults are email,firstname,lastname,mobilenumber,phonenumber,birthday,avatar,biography)</li>
 * </ul>
 */
	Future<createUserCompletion> createUser(createUserInput input);

/**
 *
 */
	Future<deleteFileEntryCompletion> deleteFileEntry(deleteFileEntryInput input);

/**
 * Delete a group
 */
	Future<deleteGroupCompletion> deleteGroup(deleteGroupInput input);

/**
 *	Get the list of in progress call by user
 */
	Future<getCurrentCallByUserCompletion> getCurrentCallByUser(getCurrentCallByUserInput input);

/**
 *
 */
	Future<getFileEntryCompletion> getFileEntry(getFileEntryInput input);

/**
 *
 */
	Future<getFileEntryListCompletion> getFileEntryList(getFileEntryListInput input);

/**
 * Get a group
 */
	Future<getGroupCompletion> getGroup(getGroupInput input);

/**
 * Get all user groups
 */
	Future<getGroupListCompletion> getGroupList(getGroupListInput input);

/**
 * Get metadata
 */
	Future<getMetadataCompletion> getMetadata(getMetadataInput input);

/**
 *	Get the list of missed call by user
 */
	Future<getMissedCallByUserCompletion> getMissedCallByUser(getMissedCallByUserInput input);

/**
 *
 */
	Future<getRoomCompletion> getRoom(getRoomInput input);

/**
 *
 */
	Future<getRoomMessageCompletion> getRoomMessage(getRoomMessageInput input);

/**
 *
 */
	Future<getRoomMessageListCompletion> getRoomMessageList(getRoomMessageListInput input);

/**
 *
 */
	Future<getTagsCompletion> getTags(getTagsInput input);

/**
 * Get targets associated to a specific id
 * Targets represent a list of string (group id or user key) 
 */
	Future<getTargetsCompletion> getTargets(getTargetsInput input);

/**
 * Get user profile according to the given user key
 * <strong>UserKey is not the login used to connect the user</strong>
 * To get a user profile based on the login value, you have to call <a href="./getUserbyLogin.html">getUserbyLogin()</a>
 * User Key is the uniq key associted to each ZetaPush user. You can acces to this value with special keyword <strong>__userKey</strong>
 */
	Future<getUserCompletion> getUser(getUserInput input);

/**
 * Get user profile according to the login use to connect the user
 * <strong>Login is not the user key of the user</strong>
 */
	Future<getUserByLoginCompletion> getUserByLogin(getUserByLoginInput input);

/**
 * Get all the groups user is part of
 */
	Future<getUserGroupListCompletion> getUserGroupList(getUserGroupListInput input);

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
	Future<getUserListCompletion> getUserList(getUserListInput input);

/**
 *
 */
	Future<getUserRoomListCompletion> getUserRoomList(getUserRoomListInput input);

/**
 * Test membership for current user for a group id and owner
 */
	Future<isMemberOfCompletion> isMemberOf(isMemberOfInput input);

/**
 * Create a room with the global owner user
 */
	Future<leavePublicRoomCompletion> leavePublicRoom(leavePublicRoomInput input);

/**
 *
 */
	Future<purgeRoomMessageListCompletion> purgeRoomMessageList(purgeRoomMessageListInput input);

/**
 * Remove user from a group
 */
	Future<removeGroupMemberCompletion> removeGroupMember(removeGroupMemberInput input);

/**
 * Remove metadata
 */
	Future<removeMetadataCompletion> removeMetadata(removeMetadataInput input);

/**
 *
 */
	Future<removeRoomMemberCompletion> removeRoomMember(removeRoomMemberInput input);

/**
 * Remove tags
 */
	Future<removeTagsCompletion> removeTags(removeTagsInput input);

/**
 * Remove targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */
	Future<removeTargetsCompletion> removeTargets(removeTargetsInput input);

/**
 *
 */
	Future<requestFileUploadCompletion> requestFileUpload(requestFileUploadInput input);

	Future<resetUserPasswordCompletion> resetUserPassword(resetUserPasswordInput input);

	Future<resetUserPasswordByLoginCompletion> resetUserPasswordByLogin(resetUserPasswordByLoginInput input);

/**
 *
 */
	Future<sendRoomMessageToMemberCompletion> sendRoomMessageToMember(sendRoomMessageToMemberInput input);

/** 
 *	Macroscript called when the call is accepted.
 *	We change the state of the call in the database
 */
	Future<setCallAcceptedCompletion> setCallAccepted(setCallAcceptedInput input);

/** 
 *	Macroscript called when the call is refused.
 *	We change the state of the call in the database
 */
	Future<setCallRefusedCompletion> setCallRefused(setCallRefusedInput input);

/** 
 *	Macroscript called when the call is terminated.
 *	We change the state of the call in the database
 */
	Future<setCallTerminatedCompletion> setCallTerminated(setCallTerminatedInput input);

/**
 * Set metadata
 */
	Future<setMetadataCompletion> setMetadata(setMetadataInput input);

/**
 *
 */
	Future<setTagsCompletion> setTags(setTagsInput input);

/**
 * Define targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */
	Future<setTargetsCompletion> setTargets(setTargetsInput input);

/**
 *	Macroscript called after the timeout.
 *	This timeout is used to simulate a call that is ringing on the device
 */
	Future<timeoutCallCompletion> timeoutCall(timeoutCallInput input);

/**
 *
 */
	Future<updateRoomMessageByServiceCompletion> updateRoomMessageByService(updateRoomMessageByServiceInput input);

/**
 * Update user profile
 * User profile can be customized with the followings config variables:
 * <ul>
 *	<li><strong>@config.authentication.simple.mandatory_fields</strong> Add mandatory fields to user profile (default is email)</li>
 *	<li><strong>@config.authentication.simple.public_fields</strong> Add public fields to user profile (defaults are email,firstname,lastname,mobilenumber,phonenumber,birthday,avatar,biography)</li>
 * </ul>
 */
	Future<updateUserCompletion> updateUser(updateUserInput input);

/**
 * Set avatar in user profile
 */
	Future<updateUserAvatarCompletion> updateUserAvatar(updateUserAvatarInput input);


	/** Entry point class */
	public static class Factory {
		/** Entry point */
		public static VisioFutureApi createService(ZetapushClient client, String deploymentId) {
			return client.createMacroService(VisioFutureApi.class, deploymentId);
		}
	}
}
