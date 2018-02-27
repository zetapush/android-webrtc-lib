package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.Map;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.updateRoomMessageByServiceInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.updateRoomMessageByServiceInput$Impl.class, name = "com.zetapush.core.room.updateRoomMessageByServiceInput") })
public interface updateRoomMessageByServiceInput {

	/** Getter for field id
	 * Room message id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomMessageId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 52
<li><b>max</b> (maximum value): 52
</ul>
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field room
	 * Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Room getRoom();

	/** Setter for field room */
	void setRoom(Room room);

	/** Getter for field value
	 * Message value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Map<String, Object> getValue();

	/** Setter for field value */
	void setValue(Map<String, Object> value);
}
