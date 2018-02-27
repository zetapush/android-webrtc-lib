package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.purgeRoomMessageListInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.purgeRoomMessageListInput$Impl.class, name = "com.zetapush.core.room.purgeRoomMessageListInput") })
public interface purgeRoomMessageListInput {

	/** Getter for field room
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Room getRoom();

	/** Setter for field room */
	void setRoom(Room room);
}
