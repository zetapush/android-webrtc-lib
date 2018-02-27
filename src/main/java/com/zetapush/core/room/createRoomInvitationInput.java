package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.Map;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.createRoomInvitationInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.createRoomInvitationInput$Impl.class, name = "com.zetapush.core.room.createRoomInvitationInput") })
public interface createRoomInvitationInput {

	/** Getter for field id
	 * Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field context
	 * Invitation type<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Map<String, Object> getContext();

	/** Setter for field context */
	void setContext(Map<String, Object> context);

	/** Getter for field message
	 * Invitation message<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getMessage();

	/** Setter for field message */
	void setMessage(String message);
}
