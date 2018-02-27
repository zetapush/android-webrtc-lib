package com.zetapush.core.group;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;
import java.util.Map;

/**
 * Create a group
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.group.createGroupInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.group.createGroupInput$Impl.class, name = "com.zetapush.core.group.createGroupInput") })
public interface createGroupInput {

	/** Getter for field id
	 * Optionnal group id
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field name
	 * Mandatory group name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getName();

	/** Setter for field name */
	void setName(String name);

	/** Getter for field members
	 * Optionnal group members
	 */
	List getMembers();

	/** Setter for field members */
	void setMembers(List members);

	/** Getter for field metadata
	 * Optionnal group metadata
	 */
	Map<String, Object> getMetadata();

	/** Setter for field metadata */
	void setMetadata(Map<String, Object> metadata);

	/** Getter for field tags
	 * Optionnal group tags
	 */
	List getTags();

	/** Setter for field tags */
	void setTags(List tags);
}
