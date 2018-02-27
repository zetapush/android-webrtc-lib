package com.zetapush.core.room;



public class RoomInvitation$Impl implements RoomInvitation {
	private Room room;
	private Invitation invitation;

	/** Default constructor */
	public RoomInvitation$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param room
	 *        
	 * @param invitation
	 *        
	 */
	public RoomInvitation$Impl(Room room, Invitation invitation) {
		this.room = room;
		this.invitation = invitation;
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

	public Invitation getInvitation() {
		return invitation;
	}

	/** Field invitation
	 * 
	*/
	public void setInvitation(Invitation invitation) {
		this.invitation = invitation;
	}

	public String toString() { 
		return "RoomInvitation$Impl[room=" + room + ", invitation=" + invitation + "]";
	}
}
