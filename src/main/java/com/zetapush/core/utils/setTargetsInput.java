package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Define targets associated to a specific id
 * Targets represent a list of string (group id or user key)
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.setTargetsInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.setTargetsInput$Impl.class, name = "com.zetapush.core.utils.setTargetsInput") })
public interface setTargetsInput {

	/** Getter for field id
	 * Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field targets
	 * Targets value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getTargets();

	/** Setter for field targets */
	void setTargets(String targets);
}
