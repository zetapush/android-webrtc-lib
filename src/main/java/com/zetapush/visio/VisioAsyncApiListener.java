package com.zetapush.visio;

import com.zetapush.client.AutoClientListener;
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
import com.zetapush.core.room.acceptRoomInvitationCompletion;
import com.zetapush.core.room.addRoomMemberCompletion;
import com.zetapush.core.room.addRoomMessageCompletion;
import com.zetapush.core.room.createOneToOneRoomCompletion;
import com.zetapush.core.room.createOrJoinPublicRoomCompletion;
import com.zetapush.core.room.createRoomCompletion;
import com.zetapush.core.room.createRoomInvitationCompletion;
import com.zetapush.core.room.createRoomMemberInvitationCompletion;
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

public interface VisioAsyncApiListener extends AutoClientListener {
/**
 * Accept Room Invitation
 */
	void acceptRoomInvitation(acceptRoomInvitationCompletion notification);

/**
 * Add user in a group
 */
	void addGroupMember(addGroupMemberCompletion notification);

/**
 *
 */
	void addRoomMember(addRoomMemberCompletion notification);

/**
 *
 */
	void addRoomMessage(addRoomMessageCompletion notification);

/** 
 *	Macroscript that used to send the call object as a missed call.
 *	The client need to listen this macroscript to handle missed calls
 */
	void addToMissedCall(addToMissedCallCompletion notification);

/**
 *	Macrosript used to send a call to a group
 */
	void callGroup(callGroupCompletion notification);

/**
 *
 */
	void confirmFileUpload(confirmFileUploadCompletion notification);

/**
 * Confirm the new user password.
 * Token and password are required, token can be retreived via a call on resetUserPassword macro
 */
	void confirmUserPassword(confirmUserPasswordCompletion notification);

/**
 * Create a group
 */
	void createGroup(createGroupCompletion notification);

/**
 *
 */
	void createOneToOneRoom(createOneToOneRoomCompletion notification);

/**
 * Create a room with the global owner user
 */
	void createOrJoinPublicRoom(createOrJoinPublicRoomCompletion notification);

/**
 *
 */
	void createRoom(createRoomCompletion notification);

/**
 *
 */
	void createRoomInvitation(createRoomInvitationCompletion notification);

/**
 *
 */
	void createRoomMemberInvitation(createRoomMemberInvitationCompletion notification);

/**
 * Create a new ZetaPush with a credentials based authentication
 * User profile can be customized with the followings config variables:
 * <ul>
 *	<li><strong>@config.authentication.simple.mandatory_fields</strong> Add mandatory fields to user profile (default is email)</li>
 *	<li><strong>@config.authentication.simple.public_fields</strong> Add public fields to user profile (defaults are email,firstname,lastname,mobilenumber,phonenumber,birthday,avatar,biography)</li>
 * </ul>
 */
	void createUser(createUserCompletion notification);

/**
 *
 */
	void deleteFileEntry(deleteFileEntryCompletion notification);

/**
 * Delete a group
 */
	void deleteGroup(deleteGroupCompletion notification);

/**
 *	Get the list of in progress call by user
 */
	void getCurrentCallByUser(getCurrentCallByUserCompletion notification);

/**
 *
 */
	void getFileEntry(getFileEntryCompletion notification);

/**
 *
 */
	void getFileEntryList(getFileEntryListCompletion notification);

/**
 * Get a group
 */
	void getGroup(getGroupCompletion notification);

/**
 * Get all user groups
 */
	void getGroupList(getGroupListCompletion notification);

/**
 * Get metadata
 */
	void getMetadata(getMetadataCompletion notification);

/**
 *	Get the list of missed call by user
 */
	void getMissedCallByUser(getMissedCallByUserCompletion notification);

/**
 *
 */
	void getRoom(getRoomCompletion notification);

/**
 *
 */
	void getRoomMessage(getRoomMessageCompletion notification);

/**
 *
 */
	void getRoomMessageList(getRoomMessageListCompletion notification);

/**
 *
 */
	void getTags(getTagsCompletion notification);

/**
 * Get targets associated to a specific id
 * Targets represent a list of string (group id or user key) 
 */
	void getTargets(getTargetsCompletion notification);

/**
 * Get user profile according to the given user key
 * <strong>UserKey is not the login used to connect the user</strong>
 * To get a user profile based on the login value, you have to call <a href="./getUserbyLogin.html">getUserbyLogin()</a>
 * User Key is the uniq key associted to each ZetaPush user. You can acces to this value with special keyword <strong>__userKey</strong>
 */
	void getUser(getUserCompletion notification);

/**
 * Get user profile according to the login use to connect the user
 * <strong>Login is not the user key of the user</strong>
 */
	void getUserByLogin(getUserByLoginCompletion notification);

/**
 * Get all the groups user is part of
 */
	void getUserGroupList(getUserGroupListCompletion notification);

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
	void getUserList(getUserListCompletion notification);

/**
 *
 */
	void getUserRoomList(getUserRoomListCompletion notification);

/**
 * Test membership for current user for a group id and owner
 */
	void isMemberOf(isMemberOfCompletion notification);

/**
 * Create a room with the global owner user
 */
	void leavePublicRoom(leavePublicRoomCompletion notification);

/**
 *
 */
	void purgeRoomMessageList(purgeRoomMessageListCompletion notification);

/**
 * Remove user from a group
 */
	void removeGroupMember(removeGroupMemberCompletion notification);

/**
 * Remove metadata
 */
	void removeMetadata(removeMetadataCompletion notification);

/**
 *
 */
	void removeRoomMember(removeRoomMemberCompletion notification);

/**
 * Remove tags
 */
	void removeTags(removeTagsCompletion notification);

/**
 * Remove targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */
	void removeTargets(removeTargetsCompletion notification);

/**
 *
 */
	void requestFileUpload(requestFileUploadCompletion notification);

	void resetUserPassword(resetUserPasswordCompletion notification);

	void resetUserPasswordByLogin(resetUserPasswordByLoginCompletion notification);

/**
 *
 */
	void sendRoomMessageToMember(sendRoomMessageToMemberCompletion notification);

/** 
 *	Macroscript called when the call is accepted.
 *	We change the state of the call in the database
 */
	void setCallAccepted(setCallAcceptedCompletion notification);

/** 
 *	Macroscript called when the call is refused.
 *	We change the state of the call in the database
 */
	void setCallRefused(setCallRefusedCompletion notification);

/** 
 *	Macroscript called when the call is terminated.
 *	We change the state of the call in the database
 */
	void setCallTerminated(setCallTerminatedCompletion notification);

/**
 * Set metadata
 */
	void setMetadata(setMetadataCompletion notification);

/**
 *
 */
	void setTags(setTagsCompletion notification);

/**
 * Define targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */
	void setTargets(setTargetsCompletion notification);

/**
 *	Macroscript called after the timeout.
 *	This timeout is used to simulate a call that is ringing on the device
 */
	void timeoutCall(timeoutCallCompletion notification);

/**
 *
 */
	void updateRoomMessageByService(updateRoomMessageByServiceCompletion notification);

/**
 * Update user profile
 * User profile can be customized with the followings config variables:
 * <ul>
 *	<li><strong>@config.authentication.simple.mandatory_fields</strong> Add mandatory fields to user profile (default is email)</li>
 *	<li><strong>@config.authentication.simple.public_fields</strong> Add public fields to user profile (defaults are email,firstname,lastname,mobilenumber,phonenumber,birthday,avatar,biography)</li>
 * </ul>
 */
	void updateUser(updateUserCompletion notification);

/**
 * Set avatar in user profile
 */
	void updateUserAvatar(updateUserAvatarCompletion notification);

	/** Entry point class */
	public static class Factory {
		/** Listener registration
		* @param listener an instance of a class implementing VisioAsyncApiListener */
		public static VisioAsyncApiListener registerListener(VisioAsyncApiListener listener, ZetapushClient client, String deploymentId) {
			client.subscribeMacroListener(deploymentId, listener);
			return listener;
		}

		public static VisioAsyncApiListener unregisterListener(VisioAsyncApiListener listener, ZetapushClient client) {
		    client.unsubscribeMacroListener(listener);
		    return listener;
        }
	}

	/** Adapter class with empty implementations */
	public static class Adapter implements VisioAsyncApiListener {
		public void acceptRoomInvitation(acceptRoomInvitationCompletion notification) {
		}

		public void addGroupMember(addGroupMemberCompletion notification) {
		}

		public void addRoomMember(addRoomMemberCompletion notification) {
		}

		public void addRoomMessage(addRoomMessageCompletion notification) {
		}

		public void addToMissedCall(addToMissedCallCompletion notification) {
		}

		public void callGroup(callGroupCompletion notification) {
		}

		public void confirmFileUpload(confirmFileUploadCompletion notification) {
		}

		public void confirmUserPassword(confirmUserPasswordCompletion notification) {
		}

		public void createGroup(createGroupCompletion notification) {
		}

		public void createOneToOneRoom(createOneToOneRoomCompletion notification) {
		}

		public void createOrJoinPublicRoom(createOrJoinPublicRoomCompletion notification) {
		}

		public void createRoom(createRoomCompletion notification) {
		}

		public void createRoomInvitation(createRoomInvitationCompletion notification) {
		}

		public void createRoomMemberInvitation(createRoomMemberInvitationCompletion notification) {
		}

		public void createUser(createUserCompletion notification) {
		}

		public void deleteFileEntry(deleteFileEntryCompletion notification) {
		}

		public void deleteGroup(deleteGroupCompletion notification) {
		}

		public void getCurrentCallByUser(getCurrentCallByUserCompletion notification) {
		}

		public void getFileEntry(getFileEntryCompletion notification) {
		}

		public void getFileEntryList(getFileEntryListCompletion notification) {
		}

		public void getGroup(getGroupCompletion notification) {
		}

		public void getGroupList(getGroupListCompletion notification) {
		}

		public void getMetadata(getMetadataCompletion notification) {
		}

		public void getMissedCallByUser(getMissedCallByUserCompletion notification) {
		}

		public void getRoom(getRoomCompletion notification) {
		}

		public void getRoomMessage(getRoomMessageCompletion notification) {
		}

		public void getRoomMessageList(getRoomMessageListCompletion notification) {
		}

		public void getTags(getTagsCompletion notification) {
		}

		public void getTargets(getTargetsCompletion notification) {
		}

		public void getUser(getUserCompletion notification) {
		}

		public void getUserByLogin(getUserByLoginCompletion notification) {
		}

		public void getUserGroupList(getUserGroupListCompletion notification) {
		}

		public void getUserList(getUserListCompletion notification) {
		}

		public void getUserRoomList(getUserRoomListCompletion notification) {
		}

		public void isMemberOf(isMemberOfCompletion notification) {
		}

		public void leavePublicRoom(leavePublicRoomCompletion notification) {
		}

		public void purgeRoomMessageList(purgeRoomMessageListCompletion notification) {
		}

		public void removeGroupMember(removeGroupMemberCompletion notification) {
		}

		public void removeMetadata(removeMetadataCompletion notification) {
		}

		public void removeRoomMember(removeRoomMemberCompletion notification) {
		}

		public void removeTags(removeTagsCompletion notification) {
		}

		public void removeTargets(removeTargetsCompletion notification) {
		}

		public void requestFileUpload(requestFileUploadCompletion notification) {
		}

		public void resetUserPassword(resetUserPasswordCompletion notification) {
		}

		public void resetUserPasswordByLogin(resetUserPasswordByLoginCompletion notification) {
		}

		public void sendRoomMessageToMember(sendRoomMessageToMemberCompletion notification) {
		}

		public void setCallAccepted(setCallAcceptedCompletion notification) {
		}

		public void setCallRefused(setCallRefusedCompletion notification) {
		}

		public void setCallTerminated(setCallTerminatedCompletion notification) {
		}

		public void setMetadata(setMetadataCompletion notification) {
		}

		public void setTags(setTagsCompletion notification) {
		}

		public void setTargets(setTargetsCompletion notification) {
		}

		public void timeoutCall(timeoutCallCompletion notification) {
		}

		public void updateRoomMessageByService(updateRoomMessageByServiceCompletion notification) {
		}

		public void updateUser(updateUserCompletion notification) {
		}

		public void updateUserAvatar(updateUserAvatarCompletion notification) {
		}

	}
}
