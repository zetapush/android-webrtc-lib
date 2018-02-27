package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.FileEntry$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.FileEntry$Impl.class, name = "com.zetapush.core.file.FileEntry") })
public interface FileEntry {

	/** Getter for field exists
	 * 
	 */
	Boolean isExists();

	/** Setter for field exists */
	void setExists(Boolean exists);

	/** Getter for field entry
	 * 
	 */
	FileEntryInfo getEntry();

	/** Setter for field entry */
	void setEntry(FileEntryInfo entry);
}
