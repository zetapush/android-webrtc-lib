package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.createRoomInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.createRoomInput$Impl.class, name = "com.zetapush.core.room.createRoomInput") })
public interface createRoomInput {

	/** Getter for field name
	 * Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getName();

	/** Setter for field name */
	void setName(String name);

	/** Getter for field members
	 * Room room members<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	List getMembers();

	/** Setter for field members */
	void setMembers(List members);
}
