package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;
import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.FileEntryInfo$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.FileEntryInfo$Impl.class, name = "com.zetapush.core.file.FileEntryInfo") })
public interface FileEntryInfo {

	/** Getter for field name
	 * 
	 */
	String getName();

	/** Setter for field name */
	void setName(String name);

	/** Getter for field type
	 * 
	 */
	String getType();

	/** Setter for field type */
	void setType(String type);

	/** Getter for field file
	 * 
	 */
	FileUrl getFile();

	/** Setter for field file */
	void setFile(FileUrl file);

	/** Getter for field creation
	 * 
	 */
	Number getCreation();

	/** Setter for field creation */
	void setCreation(Number creation);

	/** Getter for field metadata
	 * 
	 */
	Map<String, Object> getMetadata();

	/** Setter for field metadata */
	void setMetadata(Map<String, Object> metadata);

	/** Getter for field tags
	 * 
	 */
	List<String> getTags();

	/** Setter for field tags */
	void setTags(List<String> tags);

	/** Getter for field owner
	 * 
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);
}
