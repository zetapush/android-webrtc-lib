package com.zetapush.core.file;

import java.util.List;
import java.util.Map;


public class confirmFileUploadInput$Impl implements confirmFileUploadInput {
	private String guid;
	private String owner;
	private Map<String, Object> actions;
	private Map<String, Object> metadata;
	private List tags;

	/** Default constructor */
	public confirmFileUploadInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param guid
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 * @param actions
	 *        
	 * @param metadata
	 *        
	 * @param tags
	 *        
	 */
	public confirmFileUploadInput$Impl(String guid, String owner, Map<String, Object> actions, Map<String, Object> metadata, List tags) {
		this.guid = guid;
		this.owner = owner;
		this.actions = actions;
		this.metadata = metadata;
		this.tags = tags;
	}

	public String getGuid() {
		return guid;
	}

	/** Field guid
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setGuid(String guid) {
		this.guid = guid;
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

	public Map<String, Object> getActions() {
		return actions;
	}

	/** Field actions
	 * 
	*/
	public void setActions(Map<String, Object> actions) {
		this.actions = actions;
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

	public List getTags() {
		return tags;
	}

	/** Field tags
	 * 
	*/
	public void setTags(List tags) {
		this.tags = tags;
	}

	public String toString() { 
		return "confirmFileUploadInput$Impl[guid=" + guid + ", owner=" + owner + ", actions=" + actions + ", metadata=" + metadata + ", tags=" + tags + "]";
	}
}
