package com.zetapush.core.room;


/** Result of the call to macro 'createOneToOneRoom' */
public class createOneToOneRoomOutput {
	private Room room;

	/** Default constructor */
	public createOneToOneRoomOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        
	 */
	public createOneToOneRoomOutput(Room room) {
		this.room = room;
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

	public String toString() { 
		return "createOneToOneRoomOutput[room=" + room + "]";
	}
}
