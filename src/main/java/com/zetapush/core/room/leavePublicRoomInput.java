package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Create a room with the global owner user
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.leavePublicRoomInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.leavePublicRoomInput$Impl.class, name = "com.zetapush.core.room.leavePublicRoomInput") })
public interface leavePublicRoomInput {

	/** Getter for field name
	 * Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getName();

	/** Setter for field name */
	void setName(String name);
}
