package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Contains informations to upload a file on Zetapush platform
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.FileUploadRequest$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.FileUploadRequest$Impl.class, name = "com.zetapush.core.file.FileUploadRequest") })
public interface FileUploadRequest {

	/** Getter for field contentType
	 * 
	 */
	String getContentType();

	/** Setter for field contentType */
	void setContentType(String contentType);

	/** Getter for field httpMethod
	 * 
	 */
	String getHttpMethod();

	/** Setter for field httpMethod */
	void setHttpMethod(String httpMethod);

	/** Getter for field guid
	 * 
	 */
	String getGuid();

	/** Setter for field guid */
	void setGuid(String guid);

	/** Getter for field url
	 * 
	 */
	String getUrl();

	/** Setter for field url */
	void setUrl(String url);

	/** Getter for field owner
	 * 
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);
}
