package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Remove targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.removeTargetsInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.removeTargetsInput$Impl.class, name = "com.zetapush.core.utils.removeTargetsInput") })
public interface removeTargetsInput {

	/** Getter for field id
	 * Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);
}
