package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Accept Room Invitation
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.acceptRoomInvitationInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.acceptRoomInvitationInput$Impl.class, name = "com.zetapush.core.room.acceptRoomInvitationInput") })
public interface acceptRoomInvitationInput {

	/** Getter for field invitationId
	 * Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getInvitationId();

	/** Setter for field invitationId */
	void setInvitationId(String invitationId);

	/** Getter for field roomId
	 * Owner id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getRoomId();

	/** Setter for field roomId */
	void setRoomId(String roomId);

	/** Getter for field owner
	 * Invitation owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);
}
