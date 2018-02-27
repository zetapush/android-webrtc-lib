package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.Invitation$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.Invitation$Impl.class, name = "com.zetapush.core.room.Invitation") })
public interface Invitation {

	/** Getter for field id
	 * Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field owner
	 * Invitation id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);

	/** Getter for field guest
	 * Guest user key
	 */
	String getGuest();

	/** Setter for field guest */
	void setGuest(String guest);

	/** Getter for field expiry
	 * Invitation exipry
	 */
	Number getExpiry();

	/** Setter for field expiry */
	void setExpiry(Number expiry);

	/** Getter for field createdAt
	 * Invitation createdAt
	 */
	Number getCreatedAt();

	/** Setter for field createdAt */
	void setCreatedAt(Number createdAt);

	/** Getter for field context
	 * Invitation context
	 */
	Map<String, Object> getContext();

	/** Setter for field context */
	void setContext(Map<String, Object> context);

	/** Getter for field message
	 * Invitation message
	 */
	String getMessage();

	/** Setter for field message */
	void setMessage(String message);
}
