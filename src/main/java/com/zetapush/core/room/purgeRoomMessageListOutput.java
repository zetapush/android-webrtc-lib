package com.zetapush.core.room;

import java.util.List;
import java.util.Map;

/** Result of the call to macro 'purgeRoomMessageList' */
public class purgeRoomMessageListOutput {
	private String container;
	private Room room;
	private List<Map<String, Object>> list;

	/** Default constructor */
	public purgeRoomMessageListOutput() {
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
	 */
	public purgeRoomMessageListOutput(String container, Room room, List<Map<String, Object>> list) {
		this.container = container;
		this.room = room;
		this.list = list;
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

	public List<Map<String, Object>> getList() {
		return list;
	}

	/** Field list
	 * 
	*/
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	public String toString() { 
		return "purgeRoomMessageListOutput[container=" + container + ", room=" + room + ", list=" + list + "]";
	}
}
