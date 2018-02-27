package com.zetapush.core.room;

import java.util.Map;


public class updateRoomMessageByServiceInput$Impl implements updateRoomMessageByServiceInput {
	private String id;
	private Room room;
	private Map<String, Object> value;

	/** Default constructor */
	public updateRoomMessageByServiceInput$Impl() {
	}
	/**
	 * All args constructor
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
	public updateRoomMessageByServiceInput$Impl(String id, Room room, Map<String, Object> value) {
		this.id = id;
		this.room = room;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Room message id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomMessageId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 52
<li><b>max</b> (maximum value): 52
</ul>
</ul>
	*/
	public void setId(String id) {
		this.id = id;
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

	public String toString() { 
		return "updateRoomMessageByServiceInput$Impl[id=" + id + ", room=" + room + ", value=" + value + "]";
	}
}
