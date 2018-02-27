package com.zetapush.core.group;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;
import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.group.Group$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.Room$Impl.class, name = "com.zetapush.core.room.Room"),
	@Type(value = com.zetapush.core.group.Group$Impl.class, name = "com.zetapush.core.group.Group") })
public interface Group {

	/** Getter for field id
	 * Group id
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field deploymentId
	 * Group deployment id
	 */
	String getDeploymentId();

	/** Setter for field deploymentId */
	void setDeploymentId(String deploymentId);

	/** Getter for field name
	 * Group name
	 */
	String getName();

	/** Setter for field name */
	void setName(String name);

	/** Getter for field owner
	 * Group owner
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);

	/** Getter for field resource
	 * Group resource
	 */
	String getResource();

	/** Setter for field resource */
	void setResource(String resource);

	/** Getter for field members
	 * Group members
	 */
	List getMembers();

	/** Setter for field members */
	void setMembers(List members);

	/** Getter for field metadata
	 * Group metadata
	 */
	Map<String, Object> getMetadata();

	/** Setter for field metadata */
	void setMetadata(Map<String, Object> metadata);

	/** Getter for field tags
	 * Group tags
	 */
	List<String> getTags();

	/** Setter for field tags */
	void setTags(List<String> tags);
}
