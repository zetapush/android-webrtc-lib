package com.zetapush.core.room;

import java.util.Map;


public class Invitation$Impl implements Invitation {
	private String id;
	private String owner;
	private String guest;
	private Number expiry;
	private Number createdAt;
	private Map<String, Object> context;
	private String message;

	/** Default constructor */
	public Invitation$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param guest
	 *        Guest user key
	 * @param expiry
	 *        Invitation exipry
	 * @param createdAt
	 *        Invitation createdAt
	 * @param context
	 *        Invitation context
	 * @param message
	 *        Invitation message
	 */
	public Invitation$Impl(String id, String owner, String guest, Number expiry, Number createdAt, Map<String, Object> context, String message) {
		this.id = id;
		this.owner = owner;
		this.guest = guest;
		this.expiry = expiry;
		this.createdAt = createdAt;
		this.context = context;
		this.message = message;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getGuest() {
		return guest;
	}

	/** Field guest
	 * Guest user key
	*/
	public void setGuest(String guest) {
		this.guest = guest;
	}

	public Number getExpiry() {
		return expiry;
	}

	/** Field expiry
	 * Invitation exipry
	*/
	public void setExpiry(Number expiry) {
		this.expiry = expiry;
	}

	public Number getCreatedAt() {
		return createdAt;
	}

	/** Field createdAt
	 * Invitation createdAt
	*/
	public void setCreatedAt(Number createdAt) {
		this.createdAt = createdAt;
	}

	public Map<String, Object> getContext() {
		return context;
	}

	/** Field context
	 * Invitation context
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

	public String toString() { 
		return "Invitation$Impl[id=" + id + ", owner=" + owner + ", guest=" + guest + ", expiry=" + expiry + ", createdAt=" + createdAt + ", context=" + context + ", message=" + message + "]";
	}
}
