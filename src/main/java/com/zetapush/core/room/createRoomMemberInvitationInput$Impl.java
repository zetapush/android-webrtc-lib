package com.zetapush.core.room;

import java.util.Map;


public class createRoomMemberInvitationInput$Impl implements createRoomMemberInvitationInput {
	private String id;
	private String guest;
	private Map<String, Object> context;
	private String message;
	private String owner;

	/** Default constructor */
	public createRoomMemberInvitationInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param guest
	 *        User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param context
	 *        Invitation type
	 * @param message
	 *        Invitation message
	 * @param owner
	 *        Owner
	 */
	public createRoomMemberInvitationInput$Impl(String id, String guest, Map<String, Object> context, String message, String owner) {
		this.id = id;
		this.guest = guest;
		this.context = context;
		this.message = message;
		this.owner = owner;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String getGuest() {
		return guest;
	}

	/** Field guest
	 * User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setGuest(String guest) {
		this.guest = guest;
	}

	public Map<String, Object> getContext() {
		return context;
	}

	/** Field context
	 * Invitation type
	*/
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}

	public String getMessage() {
		return message;
	}

	/** Field message
	 * Invitation message
	*/
	public void setMessage(String message) {
		this.message = message;
	}

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * Owner
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String toString() { 
		return "createRoomMemberInvitationInput$Impl[id=" + id + ", guest=" + guest + ", context=" + context + ", message=" + message + ", owner=" + owner + "]";
	}
}
