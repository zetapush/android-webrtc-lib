package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;
import java.util.Map;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.confirmFileUploadInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.confirmFileUploadInput$Impl.class, name = "com.zetapush.core.file.confirmFileUploadInput") })
public interface confirmFileUploadInput {

	/** Getter for field guid
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getGuid();

	/** Setter for field guid */
	void setGuid(String guid);

	/** Getter for field owner
	 * 
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);

	/** Getter for field actions
	 * 
	 */
	Map<String, Object> getActions();

	/** Setter for field actions */
	void setActions(Map<String, Object> actions);

	/** Getter for field metadata
	 * 
	 */
	Map<String, Object> getMetadata();

	/** Setter for field metadata */
	void setMetadata(Map<String, Object> metadata);

	/** Getter for field tags
	 * 
	 */
	List getTags();

	/** Setter for field tags */
	void setTags(List tags);
}
