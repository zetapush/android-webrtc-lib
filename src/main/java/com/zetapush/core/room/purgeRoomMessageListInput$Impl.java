package com.zetapush.core.room;



public class purgeRoomMessageListInput$Impl implements purgeRoomMessageListInput {
	private Room room;

	/** Default constructor */
	public purgeRoomMessageListInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public purgeRoomMessageListInput$Impl(Room room) {
		this.room = room;
	}

	public Room getRoom() {
		return room;
	}

	/** Field room
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setRoom(Room room) {
		this.room = room;
	}

	public String toString() { 
		return "purgeRoomMessageListInput$Impl[room=" + room + "]";
	}
}
