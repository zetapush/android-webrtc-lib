package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.FileEntryList$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.FileEntryList$Impl.class, name = "com.zetapush.core.file.FileEntryList") })
public interface FileEntryList {

	/** Getter for field exists
	 * 
	 */
	Boolean isExists();

	/** Setter for field exists */
	void setExists(Boolean exists);

	/** Getter for field folder
	 * 
	 */
	String getFolder();

	/** Setter for field folder */
	void setFolder(String folder);

	/** Getter for field entries
	 * 
	 */
	List<FileEntryInfo> getEntries();

	/** Setter for field entries */
	void setEntries(List<FileEntryInfo> entries);

	/** Getter for field owner
	 * 
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);
}
