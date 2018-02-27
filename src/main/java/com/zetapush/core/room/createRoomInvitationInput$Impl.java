package com.zetapush.core.room;

import java.util.Map;


public class createRoomInvitationInput$Impl implements createRoomInvitationInput {
	private String id;
	private Map<String, Object> context;
	private String message;

	/** Default constructor */
	public createRoomInvitationInput$Impl() {
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
	 * @param context
	 *        Invitation type<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param message
	 *        Invitation message<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public createRoomInvitationInput$Impl(String id, Map<String, Object> context, String message) {
		this.id = id;
		this.context = context;
		this.message = message;
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

	public Map<String, Object> getContext() {
		return context;
	}

	/** Field context
	 * Invitation type<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}

	public String getMessage() {
		return message;
	}

	/** Field message
	 * Invitation message<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() { 
		return "createRoomInvitationInput$Impl[id=" + id + ", context=" + context + ", message=" + message + "]";
	}
}
