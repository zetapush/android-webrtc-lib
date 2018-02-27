package com.zetapush.core.room;


/** Result of the call to macro 'leavePublicRoom' */
public class leavePublicRoomOutput {
	private Room room;
	private Object member;

	/** Default constructor */
	public leavePublicRoomOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        
	 * @param member
	 *        
	 */
	public leavePublicRoomOutput(Room room, Object member) {
		this.room = room;
		this.member = member;
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

	public Object getMember() {
		return member;
	}

	/** Field member
	 * 
	*/
	public void setMember(Object member) {
		this.member = member;
	}

	public String toString() { 
		return "leavePublicRoomOutput[room=" + room + ", member=" + member + "]";
	}
}
