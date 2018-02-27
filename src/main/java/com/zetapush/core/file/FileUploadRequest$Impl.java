package com.zetapush.core.file;



public class FileUploadRequest$Impl implements FileUploadRequest {
	private String contentType;
	private String httpMethod;
	private String guid;
	private String url;
	private String owner;

	/** Default constructor */
	public FileUploadRequest$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param contentType
	 *        
	 * @param httpMethod
	 *        
	 * @param guid
	 *        
	 * @param url
	 *        
	 * @param owner
	 *        
	 */
	public FileUploadRequest$Impl(String contentType, String httpMethod, String guid, String url, String owner) {
		this.contentType = contentType;
		this.httpMethod = httpMethod;
		this.guid = guid;
		this.url = url;
		this.owner = owner;
	}

	public String getContentType() {
		return contentType;
	}

	/** Field contentType
	 * 
	*/
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getHttpMethod() {
		return httpMethod;
	}

	/** Field httpMethod
	 * 
	*/
	public void setHttpMethod(String httpMethod) {
		this.httpMethod = httpMethod;
	}

	public String getGuid() {
		return guid;
	}

	/** Field guid
	 * 
	*/
	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getUrl() {
		return url;
	}

	/** Field url
	 * 
	*/
	public void setUrl(String url) {
		this.url = url;
	}

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * 
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String toString() { 
		return "FileUploadRequest$Impl[contentType=" + contentType + ", httpMethod=" + httpMethod + ", guid=" + guid + ", url=" + url + ", owner=" + owner + "]";
	}
}
