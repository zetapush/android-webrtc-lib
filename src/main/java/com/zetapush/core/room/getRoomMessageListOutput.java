package com.zetapush.core.room;

import com.zetapush.core.utils.ResponsePagination;

import java.util.List;

/** Result of the call to macro 'getRoomMessageList' */
public class getRoomMessageListOutput {
	private String container;
	private Room room;
	private List<Message> list;
	private ResponsePagination page;

	/** Default constructor */
	public getRoomMessageListOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param container
	 *        
	 * @param room
	 *        
	 * @param list
	 *        
	 * @param page
	 *        
	 */
	public getRoomMessageListOutput(String container, Room room, List<Message> list, ResponsePagination page) {
		this.container = container;
		this.room = room;
		this.list = list;
		this.page = page;
	}

	public String getContainer() {
		return container;
	}

	/** Field container
	 * 
	*/
	public void setContainer(String container) {
		this.container = container;
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

	public List<Message> getList() {
		return list;
	}

	/** Field list
	 * 
	*/
	public void setList(List<Message> list) {
		this.list = list;
	}

	public ResponsePagination getPage() {
		return page;
	}

	/** Field page
	 * 
	*/
	public void setPage(ResponsePagination page) {
		this.page = page;
	}

	public String toString() { 
		return "getRoomMessageListOutput[container=" + container + ", room=" + room + ", list=" + list + ", page=" + page + "]";
	}
}
