package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.removeRoomMemberInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.removeRoomMemberInput$Impl.class, name = "com.zetapush.core.room.removeRoomMemberInput") })
public interface removeRoomMemberInput {

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

	/** Getter for field member
	 * User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getMember();

	/** Setter for field member */
	void setMember(String member);
}
