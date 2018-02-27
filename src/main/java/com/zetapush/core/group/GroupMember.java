package com.zetapush.core.group;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.group.GroupMember$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.group.GroupMember$Impl.class, name = "com.zetapush.core.group.GroupMember") })
public interface GroupMember {

	/** Getter for field id
	 * Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
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

	/** Getter for field resource
	 * Group resource<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getResource();

	/** Setter for field resource */
	void setResource(String resource);
}
