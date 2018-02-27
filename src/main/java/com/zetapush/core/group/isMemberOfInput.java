package com.zetapush.core.group;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Test membership for current user for a group id and owner
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.group.isMemberOfInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.group.isMemberOfInput$Impl.class, name = "com.zetapush.core.group.isMemberOfInput") })
public interface isMemberOfInput {

	/** Getter for field id
	 * Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field owner
	 * Group owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);

	/** Getter for field isHardFail
	 * Is hard fail mode<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Boolean isIsHardFail();

	/** Setter for field isHardFail */
	void setIsHardFail(Boolean isHardFail);
}
