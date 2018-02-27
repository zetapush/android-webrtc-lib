package com.zetapush.core.room;



public class getRoomMessageInput$Impl implements getRoomMessageInput {
	private String id;
	private Room room;

	/** Default constructor */
	public getRoomMessageInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Room message id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param room
	 *        Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public getRoomMessageInput$Impl(String id, Room room) {
		this.id = id;
		this.room = room;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Room message id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
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

	public String toString() { 
		return "getRoomMessageInput$Impl[id=" + id + ", room=" + room + "]";
	}
}
