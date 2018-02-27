package com.zetapush.core.room;

import com.zetapush.common.messages.remoting.GrantListItem;
import com.zetapush.core.utils.Pagination;

import java.util.List;
import java.util.Map;
/** Factory for object instantiation */
public class RoomObjectFactory {
	/** factory for new RoomInvitation instances */
	public static RoomInvitation createRoomInvitation () {
		return new RoomInvitation$Impl();
	}
	/**
	 * factory method with all parameters for RoomInvitation
	 *
	 * @param room
	 *        
	 * @param invitation
	 *        
	 */
	public static RoomInvitation createRoomInvitation(Room room, Invitation invitation) {
		return new RoomInvitation$Impl(room, invitation);
	}
	/** factory for new updateRoomMessageByServiceInput instances */
	public static updateRoomMessageByServiceInput createupdateRoomMessageByServiceInput () {
		return new updateRoomMessageByServiceInput$Impl();
	}
	/**
	 * factory method with all parameters for updateRoomMessageByServiceInput
	 *
	 * @param id
	 *        Room message id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomMessageId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 52
<li><b>max</b> (maximum value): 52
</ul>
</ul>
	 * @param room
	 *        Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param value
	 *        Message value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static updateRoomMessageByServiceInput createupdateRoomMessageByServiceInput(String id, Room room, Map<String, Object> value) {
		return new updateRoomMessageByServiceInput$Impl(id, room, value);
	}
	/** factory for new createRoomInvitationInput instances */
	public static createRoomInvitationInput createcreateRoomInvitationInput () {
		return new createRoomInvitationInput$Impl();
	}
	/**
	 * factory method with all parameters for createRoomInvitationInput
	 *
	 * @param id
	 *        Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param context
	 *        Invitation type<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param message
	 *        Invitation message<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static createRoomInvitationInput createcreateRoomInvitationInput(String id, Map<String, Object> context, String message) {
		return new createRoomInvitationInput$Impl(id, context, message);
	}
	/** factory for new addRoomMessageInput instances */
	public static addRoomMessageInput createaddRoomMessageInput () {
		return new addRoomMessageInput$Impl();
	}
	/**
	 * factory method with all parameters for addRoomMessageInput
	 *
	 * @param room
	 *        Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param type
	 *        Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	 * @param value
	 *        Message value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param metadata
	 *        Message metadata<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static addRoomMessageInput createaddRoomMessageInput(Room room, String type, Map<String, Object> value, Map<String, Object> metadata) {
		return new addRoomMessageInput$Impl(room, type, value, metadata);
	}
	/** factory for new Invitation instances */
	public static Invitation createInvitation () {
		return new Invitation$Impl();
	}
	/**
	 * factory method with all parameters for Invitation
	 *
	 * @param id
	 *        Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param guest
	 *        Guest user key
	 * @param expiry
	 *        Invitation exipry
	 * @param createdAt
	 *        Invitation createdAt
	 * @param context
	 *        Invitation context
	 * @param message
	 *        Invitation message
	 */
	public static Invitation createInvitation(String id, String owner, String guest, Number expiry, Number createdAt, Map<String, Object> context, String message) {
		return new Invitation$Impl(id, owner, guest, expiry, createdAt, context, message);
	}
	/** factory for new acceptRoomInvitationInput instances */
	public static acceptRoomInvitationInput createacceptRoomInvitationInput () {
		return new acceptRoomInvitationInput$Impl();
	}
	/**
	 * factory method with all parameters for acceptRoomInvitationInput
	 *
	 * @param invitationId
	 *        Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param roomId
	 *        Owner id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        Invitation owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static acceptRoomInvitationInput createacceptRoomInvitationInput(String invitationId, String roomId, String owner) {
		return new acceptRoomInvitationInput$Impl(invitationId, roomId, owner);
	}
	/** factory for new removeRoomMemberInput instances */
	public static removeRoomMemberInput createremoveRoomMemberInput () {
		return new removeRoomMemberInput$Impl();
	}
	/**
	 * factory method with all parameters for removeRoomMemberInput
	 *
	 * @param id
	 *        Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param member
	 *        User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static removeRoomMemberInput createremoveRoomMemberInput(String id, String member) {
		return new removeRoomMemberInput$Impl(id, member);
	}
	/** factory for new getRoomInput instances */
	public static getRoomInput creategetRoomInput () {
		return new getRoomInput$Impl();
	}
	/**
	 * factory method with all parameters for getRoomInput
	 *
	 * @param id
	 *        Room room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param owner
	 *        Room room owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param page
	 *        Room pagination
	 */
	public static getRoomInput creategetRoomInput(String id, String owner, Pagination page) {
		return new getRoomInput$Impl(id, owner, page);
	}
	/** factory for new createOneToOneRoomInput instances */
	public static createOneToOneRoomInput createcreateOneToOneRoomInput () {
		return new createOneToOneRoomInput$Impl();
	}
	/**
	 * factory method with all parameters for createOneToOneRoomInput
	 *
	 * @param interlocutor
	 *        Room interlocutor<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static createOneToOneRoomInput createcreateOneToOneRoomInput(String interlocutor) {
		return new createOneToOneRoomInput$Impl(interlocutor);
	}
	/** factory for new Room instances */
	public static Room createRoom () {
		return new Room$Impl();
	}
	/**
	 * factory method with all parameters for Room
	 *
	 * @param id
	 *        Group id
	 * @param deploymentId
	 *        Group deployment id
	 * @param name
	 *        Group name
	 * @param owner
	 *        Group owner
	 * @param resource
	 *        Group resource
	 * @param members
	 *        Group members
	 * @param metadata
	 *        Group metadata
	 * @param tags
	 *        Group tags
	 * @param grants
	 *        
	 */
	public static Room createRoom(String id, String deploymentId, String name, String owner, String resource, List members, Map<String, Object> metadata, List<String> tags, List<GrantListItem> grants) {
		return new Room$Impl(id, deploymentId, name, owner, resource, members, metadata, tags, grants);
	}
	/** factory for new getUserRoomListInput instances */
	public static getUserRoomListInput creategetUserRoomListInput () {
		return new getUserRoomListInput$Impl();
	}
	/**
	 * factory method with all parameters for getUserRoomListInput
	 *
	 * @param page
	 *        Pagination object
	 */
	public static getUserRoomListInput creategetUserRoomListInput(Pagination page) {
		return new getUserRoomListInput$Impl(page);
	}
	/** factory for new leavePublicRoomInput instances */
	public static leavePublicRoomInput createleavePublicRoomInput () {
		return new leavePublicRoomInput$Impl();
	}
	/**
	 * factory method with all parameters for leavePublicRoomInput
	 *
	 * @param name
	 *        Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static leavePublicRoomInput createleavePublicRoomInput(String name) {
		return new leavePublicRoomInput$Impl(name);
	}
	/** factory for new Message instances */
	public static Message createMessage () {
		return new Message$Impl();
	}
	/**
	 * factory method with all parameters for Message
	 *
	 * @param id
	 *        Message uniq id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomMessageId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 52
<li><b>max</b> (maximum value): 52
</ul>
</ul>
	 * @param author
	 *        Message author
	 * @param type
	 *        Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	 * @param value
	 *        Message value
	 * @param createdAt
	 *        Message created date
	 * @param metadata
	 *        Message metadata
	 * @param readers
	 *        Message readers
	 * @param targets
	 *        Message targets
	 */
	public static Message createMessage(String id, String author, String type, Map<String, Object> value, Number createdAt, Map<String, Object> metadata, List<String> readers, List<String> targets) {
		return new Message$Impl(id, author, type, value, createdAt, metadata, readers, targets);
	}
	/** factory for new addRoomMemberInput instances */
	public static addRoomMemberInput createaddRoomMemberInput () {
		return new addRoomMemberInput$Impl();
	}
	/**
	 * factory method with all parameters for addRoomMemberInput
	 *
	 * @param id
	 *        Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param member
	 *        User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static addRoomMemberInput createaddRoomMemberInput(String id, String member) {
		return new addRoomMemberInput$Impl(id, member);
	}
	/** factory for new getRoomMessageInput instances */
	public static getRoomMessageInput creategetRoomMessageInput () {
		return new getRoomMessageInput$Impl();
	}
	/**
	 * factory method with all parameters for getRoomMessageInput
	 *
	 * @param id
	 *        Room message id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param room
	 *        Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static getRoomMessageInput creategetRoomMessageInput(String id, Room room) {
		return new getRoomMessageInput$Impl(id, room);
	}
	/** factory for new getRoomMessageListInput instances */
	public static getRoomMessageListInput creategetRoomMessageListInput () {
		return new getRoomMessageListInput$Impl();
	}
	/**
	 * factory method with all parameters for getRoomMessageListInput
	 *
	 * @param room
	 *        Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param page
	 *        Pagination object
	 */
	public static getRoomMessageListInput creategetRoomMessageListInput(Room room, Pagination page) {
		return new getRoomMessageListInput$Impl(room, page);
	}
	/** factory for new sendRoomMessageToMemberInput instances */
	public static sendRoomMessageToMemberInput createsendRoomMessageToMemberInput () {
		return new sendRoomMessageToMemberInput$Impl();
	}
	/**
	 * factory method with all parameters for sendRoomMessageToMemberInput
	 *
	 * @param room
	 *        Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param member
	 *        Room member user key
	 * @param type
	 *        Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	 * @param value
	 *        Message value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param metadata
	 *        Message metadata<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static sendRoomMessageToMemberInput createsendRoomMessageToMemberInput(Room room, String member, String type, Map<String, Object> value, Map<String, Object> metadata) {
		return new sendRoomMessageToMemberInput$Impl(room, member, type, value, metadata);
	}
	/** factory for new createOrJoinPublicRoomInput instances */
	public static createOrJoinPublicRoomInput createcreateOrJoinPublicRoomInput () {
		return new createOrJoinPublicRoomInput$Impl();
	}
	/**
	 * factory method with all parameters for createOrJoinPublicRoomInput
	 *
	 * @param name
	 *        Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static createOrJoinPublicRoomInput createcreateOrJoinPublicRoomInput(String name) {
		return new createOrJoinPublicRoomInput$Impl(name);
	}
	/** factory for new purgeRoomMessageListInput instances */
	public static purgeRoomMessageListInput createpurgeRoomMessageListInput () {
		return new purgeRoomMessageListInput$Impl();
	}
	/**
	 * factory method with all parameters for purgeRoomMessageListInput
	 *
	 * @param room
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static purgeRoomMessageListInput createpurgeRoomMessageListInput(Room room) {
		return new purgeRoomMessageListInput$Impl(room);
	}
	/** factory for new createRoomInput instances */
	public static createRoomInput createcreateRoomInput () {
		return new createRoomInput$Impl();
	}
	/**
	 * factory method with all parameters for createRoomInput
	 *
	 * @param name
	 *        Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param members
	 *        Room room members<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static createRoomInput createcreateRoomInput(String name, List members) {
		return new createRoomInput$Impl(name, members);
	}
	/** factory for new createRoomMemberInvitationInput instances */
	public static createRoomMemberInvitationInput createcreateRoomMemberInvitationInput () {
		return new createRoomMemberInvitationInput$Impl();
	}
	/**
	 * factory method with all parameters for createRoomMemberInvitationInput
	 *
	 * @param id
	 *        Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param guest
	 *        User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param context
	 *        Invitation type
	 * @param message
	 *        Invitation message
	 * @param owner
	 *        Owner
	 */
	public static createRoomMemberInvitationInput createcreateRoomMemberInvitationInput(String id, String guest, Map<String, Object> context, String message, String owner) {
		return new createRoomMemberInvitationInput$Impl(id, guest, context, message, owner);
	}
}
