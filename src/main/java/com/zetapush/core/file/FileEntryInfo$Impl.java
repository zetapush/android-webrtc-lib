package com.zetapush.core.file;

import java.util.List;
import java.util.Map;


public class FileEntryInfo$Impl implements FileEntryInfo {
	private String name;
	private String type;
	private FileUrl file;
	private Number creation;
	private Map<String, Object> metadata;
	private List<String> tags;
	private String owner;

	/** Default constructor */
	public FileEntryInfo$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param name
	 *        
	 * @param type
	 *        
	 * @param file
	 *        
	 * @param creation
	 *        
	 * @param metadata
	 *        
	 * @param tags
	 *        
	 * @param owner
	 *        
	 */
	public FileEntryInfo$Impl(String name, String type, FileUrl file, Number creation, Map<String, Object> metadata, List<String> tags, String owner) {
		this.name = name;
		this.type = type;
		this.file = file;
		this.creation = creation;
		this.metadata = metadata;
		this.tags = tags;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	/** Field name
	 * 
	*/
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	/** Field type
	 * 
	*/
	public void setType(String type) {
		this.type = type;
	}

	public FileUrl getFile() {
		return file;
	}

	/** Field file
	 * 
	*/
	public void setFile(FileUrl file) {
		this.file = file;
	}

	public Number getCreation() {
		return creation;
	}

	/** Field creation
	 * 
	*/
	public void setCreation(Number creation) {
		this.creation = creation;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/** Field metadata
	 * 
	*/
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public List<String> getTags() {
		return tags;
	}

	/** Field tags
	 * 
	*/
	public void setTags(List<String> tags) {
		this.tags = tags;
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
		return "FileEntryInfo$Impl[name=" + name + ", type=" + type + ", file=" + file + ", creation=" + creation + ", metadata=" + metadata + ", tags=" + tags + ", owner=" + owner + "]";
	}
}
