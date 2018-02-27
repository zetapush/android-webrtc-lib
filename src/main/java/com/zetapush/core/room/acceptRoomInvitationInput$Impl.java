package com.zetapush.core.room;



public class acceptRoomInvitationInput$Impl implements acceptRoomInvitationInput {
	private String invitationId;
	private String roomId;
	private String owner;

	/** Default constructor */
	public acceptRoomInvitationInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param invitationId
	 *        Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param roomId
	 *        Owner id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        Invitation owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public acceptRoomInvitationInput$Impl(String invitationId, String roomId, String owner) {
		this.invitationId = invitationId;
		this.roomId = roomId;
		this.owner = owner;
	}

	public String getInvitationId() {
		return invitationId;
	}

	/** Field invitationId
	 * Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}

	public String getRoomId() {
		return roomId;
	}

	/** Field roomId
	 * Owner id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * Invitation owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String toString() { 
		return "acceptRoomInvitationInput$Impl[invitationId=" + invitationId + ", roomId=" + roomId + ", owner=" + owner + "]";
	}
}
