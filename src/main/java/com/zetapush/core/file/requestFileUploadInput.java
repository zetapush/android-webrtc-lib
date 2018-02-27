package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.requestFileUploadInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.requestFileUploadInput$Impl.class, name = "com.zetapush.core.file.requestFileUploadInput") })
public interface requestFileUploadInput {

	/** Getter for field contentType
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getContentType();

	/** Setter for field contentType */
	void setContentType(String contentType);

	/** Getter for field folder
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getFolder();

	/** Setter for field folder */
	void setFolder(String folder);

	/** Getter for field owner
	 * 
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);
}
