package com.zetapush.core.room;


/** Result of the call to macro 'acceptRoomInvitation' */
public class acceptRoomInvitationOutput {
	private Room room;

	/** Default constructor */
	public acceptRoomInvitationOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        
	 */
	public acceptRoomInvitationOutput(Room room) {
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
		return "acceptRoomInvitationOutput[room=" + room + "]";
	}
}
