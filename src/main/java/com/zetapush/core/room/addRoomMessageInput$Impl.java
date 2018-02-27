package com.zetapush.core.room;

import java.util.Map;


public class addRoomMessageInput$Impl implements addRoomMessageInput {
	private Room room;
	private String type;
	private Map<String, Object> value;
	private Map<String, Object> metadata;

	/** Default constructor */
	public addRoomMessageInput$Impl() {
	}
	/**
	 * All args constructor
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
	public addRoomMessageInput$Impl(Room room, String type, Map<String, Object> value, Map<String, Object> metadata) {
		this.room = room;
		this.type = type;
		this.value = value;
		this.metadata = metadata;
	}

	public Room getRoom() {
		return room;
	}

	/** Field room
	 * Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setRoom(Room room) {
		this.room = room;
	}

	public String getType() {
		return type;
	}

	/** Field type
	 * Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	*/
	public void setType(String type) {
		this.type = type;
	}

	public Map<String, Object> getValue() {
		return value;
	}

	/** Field value
	 * Message value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setValue(Map<String, Object> value) {
		this.value = value;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/** Field metadata
	 * Message metadata<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public String toString() { 
		return "addRoomMessageInput$Impl[room=" + room + ", type=" + type + ", value=" + value + ", metadata=" + metadata + "]";
	}
}
