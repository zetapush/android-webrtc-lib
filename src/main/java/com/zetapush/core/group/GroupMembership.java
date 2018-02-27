package com.zetapush.core.group;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.group.GroupMembership$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.group.GroupMembership$Impl.class, name = "com.zetapush.core.group.GroupMembership") })
public interface GroupMembership {

	/** Getter for field member
	 * Is member of group
	 */
	Boolean isMember();

	/** Setter for field member */
	void setMember(Boolean member);
}
