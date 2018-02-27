package com.zetapush.core.group;

import java.util.List;
import java.util.Map;


public class createGroupInput$Impl implements createGroupInput {
	private String id;
	private String name;
	private List members;
	private Map<String, Object> metadata;
	private List tags;

	/** Default constructor */
	public createGroupInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Optionnal group id
	 * @param name
	 *        Mandatory group name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param members
	 *        Optionnal group members
	 * @param metadata
	 *        Optionnal group metadata
	 * @param tags
	 *        Optionnal group tags
	 */
	public createGroupInput$Impl(String id, String name, List members, Map<String, Object> metadata, List tags) {
		this.id = id;
		this.name = name;
		this.members = members;
		this.metadata = metadata;
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Optionnal group id
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	/** Field name
	 * Mandatory group name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setName(String name) {
		this.name = name;
	}

	public List getMembers() {
		return members;
	}

	/** Field members
	 * Optionnal group members
	*/
	public void setMembers(List members) {
		this.members = members;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/** Field metadata
	 * Optionnal group metadata
	*/
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public List getTags() {
		return tags;
	}

	/** Field tags
	 * Optionnal group tags
	*/
	public void setTags(List tags) {
		this.tags = tags;
	}

	public String toString() { 
		return "createGroupInput$Impl[id=" + id + ", name=" + name + ", members=" + members + ", metadata=" + metadata + ", tags=" + tags + "]";
	}
}
