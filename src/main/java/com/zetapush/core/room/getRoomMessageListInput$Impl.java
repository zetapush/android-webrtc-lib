package com.zetapush.core.room;

import com.zetapush.core.utils.Pagination;


public class getRoomMessageListInput$Impl implements getRoomMessageListInput {
	private Room room;
	private Pagination page;

	/** Default constructor */
	public getRoomMessageListInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        Room room object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param page
	 *        Pagination object
	 */
	public getRoomMessageListInput$Impl(Room room, Pagination page) {
		this.room = room;
		this.page = page;
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

	public Pagination getPage() {
		return page;
	}

	/** Field page
	 * Pagination object
	*/
	public void setPage(Pagination page) {
		this.page = page;
	}

	public String toString() { 
		return "getRoomMessageListInput$Impl[room=" + room + ", page=" + page + "]";
	}
}
