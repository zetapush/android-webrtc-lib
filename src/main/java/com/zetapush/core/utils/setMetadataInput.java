package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.Map;

/**
 * Set metadata
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.setMetadataInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.setMetadataInput$Impl.class, name = "com.zetapush.core.utils.setMetadataInput") })
public interface setMetadataInput {

	/** Getter for field id
	 * Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field metadata
	 * Metadata value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Map<String, Object> getMetadata();

	/** Setter for field metadata */
	void setMetadata(Map<String, Object> metadata);
}
