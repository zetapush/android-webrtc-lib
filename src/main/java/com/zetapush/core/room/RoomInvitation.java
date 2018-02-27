package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.RoomInvitation$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.RoomInvitation$Impl.class, name = "com.zetapush.core.room.RoomInvitation") })
public interface RoomInvitation {

	/** Getter for field room
	 * 
	 */
	Room getRoom();

	/** Setter for field room */
	void setRoom(Room room);

	/** Getter for field invitation
	 * 
	 */
	Invitation getInvitation();

	/** Setter for field invitation */
	void setInvitation(Invitation invitation);
}
