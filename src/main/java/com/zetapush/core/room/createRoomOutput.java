package com.zetapush.core.room;


/** Result of the call to macro 'createRoom' */
public class createRoomOutput {
	private Room room;

	/** Default constructor */
	public createRoomOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        
	 */
	public createRoomOutput(Room room) {
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
		return "createRoomOutput[room=" + room + "]";
	}
}
