package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.deleteFileEntryInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.deleteFileEntryInput$Impl.class, name = "com.zetapush.core.file.deleteFileEntryInput") })
public interface deleteFileEntryInput {

	/** Getter for field path
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getPath();

	/** Setter for field path */
	void setPath(String path);

	/** Getter for field owner
	 * 
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);
}
