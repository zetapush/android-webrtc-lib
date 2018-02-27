package com.zetapush.core.room;


/** Result of the call to macro 'createOrJoinPublicRoom' */
public class createOrJoinPublicRoomOutput {
	private Room room;
	private String member;

	/** Default constructor */
	public createOrJoinPublicRoomOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        
	 * @param member
	 *        
	 */
	public createOrJoinPublicRoomOutput(Room room, String member) {
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

	public String getMember() {
		return member;
	}

	/** Field member
	 * 
	*/
	public void setMember(String member) {
		this.member = member;
	}

	public String toString() { 
		return "createOrJoinPublicRoomOutput[room=" + room + ", member=" + member + "]";
	}
}
