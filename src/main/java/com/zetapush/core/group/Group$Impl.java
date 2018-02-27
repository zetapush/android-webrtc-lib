package com.zetapush.core.group;

import java.util.List;
import java.util.Map;


public class Group$Impl implements Group {
	private String id;
	private String deploymentId;
	private String name;
	private String owner;
	private String resource;
	private List members;
	private Map<String, Object> metadata;
	private List<String> tags;

	/** Default constructor */
	public Group$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Group id
	 * @param deploymentId
	 *        Group deployment id
	 * @param name
	 *        Group name
	 * @param owner
	 *        Group owner
	 * @param resource
	 *        Group resource
	 * @param members
	 *        Group members
	 * @param metadata
	 *        Group metadata
	 * @param tags
	 *        Group tags
	 */
	public Group$Impl(String id, String deploymentId, String name, String owner, String resource, List members, Map<String, Object> metadata, List<String> tags) {
		this.id = id;
		this.deploymentId = deploymentId;
		this.name = name;
		this.owner = owner;
		this.resource = resource;
		this.members = members;
		this.metadata = metadata;
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Group id
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	/** Field deploymentId
	 * Group deployment id
	*/
	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public String getName() {
		return name;
	}

	/** Field name
	 * Group name
	*/
	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * Group owner
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getResource() {
		return resource;
	}

	/** Field resource
	 * Group resource
	*/
	public void setResource(String resource) {
		this.resource = resource;
	}

	public List getMembers() {
		return members;
	}

	/** Field members
	 * Group members
	*/
	public void setMembers(List members) {
		this.members = members;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/** Field metadata
	 * Group metadata
	*/
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public List<String> getTags() {
		return tags;
	}

	/** Field tags
	 * Group tags
	*/
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public String toString() { 
		return "Group$Impl[id=" + id + ", deploymentId=" + deploymentId + ", name=" + name + ", owner=" + owner + ", resource=" + resource + ", members=" + members + ", metadata=" + metadata + ", tags=" + tags + "]";
	}
}
