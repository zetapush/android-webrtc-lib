package com.zetapush.core.room;


/** Result of the call to macro 'addRoomMessage' */
public class addRoomMessageOutput {
	private String container;
	private Room room;
	private Message message;

	/** Default constructor */
	public addRoomMessageOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param container
	 *        
	 * @param room
	 *        
	 * @param message
	 *        
	 */
	public addRoomMessageOutput(String container, Room room, Message message) {
		this.container = container;
		this.room = room;
		this.message = message;
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

	public Message getMessage() {
		return message;
	}

	/** Field message
	 * 
	*/
	public void setMessage(Message message) {
		this.message = message;
	}

	public String toString() { 
		return "addRoomMessageOutput[container=" + container + ", room=" + room + ", message=" + message + "]";
	}
}
