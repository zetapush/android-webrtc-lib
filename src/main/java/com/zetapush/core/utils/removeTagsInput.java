package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Remove tags
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.removeTagsInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.removeTagsInput$Impl.class, name = "com.zetapush.core.utils.removeTagsInput") })
public interface removeTagsInput {

	/** Getter for field id
	 * Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);
}
