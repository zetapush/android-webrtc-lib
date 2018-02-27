package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.setTagsInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.setTagsInput$Impl.class, name = "com.zetapush.core.utils.setTagsInput") })
public interface setTagsInput {

	/** Getter for field id
	 * Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field tags
	 * tags value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getTags();

	/** Setter for field tags */
	void setTags(String tags);
}
