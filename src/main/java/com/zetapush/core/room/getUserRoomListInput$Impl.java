package com.zetapush.core.room;

import com.zetapush.core.utils.Pagination;


public class getUserRoomListInput$Impl implements getUserRoomListInput {
	private Pagination page;

	/** Default constructor */
	public getUserRoomListInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param page
	 *        Pagination object
	 */
	public getUserRoomListInput$Impl(Pagination page) {
		this.page = page;
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
		return "getUserRoomListInput$Impl[page=" + page + "]";
	}
}
