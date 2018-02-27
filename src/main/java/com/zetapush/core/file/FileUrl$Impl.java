package com.zetapush.core.file;

import java.util.Map;


public class FileUrl$Impl implements FileUrl {
	private String contentType;
	private Map<String, Object> meta;
	private String guid;
	private String path;
	private String hash;
	private Number size;
	private String url;

	/** Default constructor */
	public FileUrl$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param contentType
	 *        File mime type
	 * @param meta
	 *        Metadata, as originally uploaded
	 * @param guid
	 *        File GUID
	 * @param path
	 *        File path
	 * @param hash
	 *        File hash
	 * @param size
	 *        File size
	 * @param url
	 *        HTTP url
	 */
	public FileUrl$Impl(String contentType, Map<String, Object> meta, String guid, String path, String hash, Number size, String url) {
		this.contentType = contentType;
		this.meta = meta;
		this.guid = guid;
		this.path = path;
		this.hash = hash;
		this.size = size;
		this.url = url;
	}

	public String getContentType() {
		return contentType;
	}

	/** Field contentType
	 * File mime type
	*/
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Map<String, Object> getMeta() {
		return meta;
	}

	/** Field meta
	 * Metadata, as originally uploaded
	*/
	public void setMeta(Map<String, Object> meta) {
		this.meta = meta;
	}

	public String getGuid() {
		return guid;
	}

	/** Field guid
	 * File GUID
	*/
	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPath() {
		return path;
	}

	/** Field path
	 * File path
	*/
	public void setPath(String path) {
		this.path = path;
	}

	public String getHash() {
		return hash;
	}

	/** Field hash
	 * File hash
	*/
	public void setHash(String hash) {
		this.hash = hash;
	}

	public Number getSize() {
		return size;
	}

	/** Field size
	 * File size
	*/
	public void setSize(Number size) {
		this.size = size;
	}

	public String getUrl() {
		return url;
	}

	/** Field url
	 * HTTP url
	*/
	public void setUrl(String url) {
		this.url = url;
	}

	public String toString() { 
		return "FileUrl$Impl[contentType=" + contentType + ", meta=" + meta + ", guid=" + guid + ", path=" + path + ", hash=" + hash + ", size=" + size + ", url=" + url + "]";
	}
}
