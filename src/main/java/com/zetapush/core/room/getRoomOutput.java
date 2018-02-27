package com.zetapush.core.room;

import com.zetapush.core.utils.Pagination;

import java.util.List;
import java.util.Map;

/** Result of the call to macro 'getRoom' */
public class getRoomOutput {
	private Room room;
	private List<Map<String, Object>> messages;
	private Pagination page;

	/** Default constructor */
	public getRoomOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        
	 * @param messages
	 *        
	 * @param page
	 *        
	 */
	public getRoomOutput(Room room, List<Map<String, Object>> messages, Pagination page) {
		this.room = room;
		this.messages = messages;
		this.page = page;
	}

	public Room getRoom() {
		return room;
	}

	/** Field room
	 * 
	*/
	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Map<String, Object>> getMessages() {
		return messages;
	}

	/** Field messages
	 * 
	*/
	public void setMessages(List<Map<String, Object>> messages) {
		this.messages = messages;
	}

	public Pagination getPage() {
		return page;
	}

	/** Field page
	 * 
	*/
	public void setPage(Pagination page) {
		this.page = page;
	}

	public String toString() { 
		return "getRoomOutput[room=" + room + ", messages=" + messages + ", page=" + page + "]";
	}
}
