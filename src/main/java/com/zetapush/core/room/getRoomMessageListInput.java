package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.zetapush.core.utils.Pagination;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.getRoomMessageListInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.getRoomMessageListInput$Impl.class, name = "com.zetapush.core.room.getRoomMessageListInput") })
public interface getRoomMessageListInput {

	/** Getter for field room
	 * Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Room getRoom();

	/** Setter for field room */
	void setRoom(Room room);

	/** Getter for field page
	 * Pagination object
	 */
	Pagination getPage();

	/** Setter for field page */
	void setPage(Pagination page);
}
