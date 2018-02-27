package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.Map;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.addRoomMessageInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.addRoomMessageInput$Impl.class, name = "com.zetapush.core.room.addRoomMessageInput") })
public interface addRoomMessageInput {

	/** Getter for field room
	 * Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Room getRoom();

	/** Setter for field room */
	void setRoom(Room room);

	/** Getter for field type
	 * Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	 */
	String getType();

	/** Setter for field type */
	void setType(String type);

	/** Getter for field value
	 * Message value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Map<String, Object> getValue();

	/** Setter for field value */
	void setValue(Map<String, Object> value);

	/** Getter for field metadata
	 * Message metadata<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Map<String, Object> getMetadata();

	/** Setter for field metadata */
	void setMetadata(Map<String, Object> metadata);
}
