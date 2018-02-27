package com.zetapush.core.visio;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import java.util.Map;

/**
 *	Macrosript used to send a call to a group
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.visio.callGroupInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.visio.callGroupInput$Impl.class, name = "com.zetapush.core.visio.callGroupInput") })
public interface callGroupInput {

	/** Getter for field id
	 * ID of the group we want to call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field context
	 * Generic call context
	 */
	Map<String, Object> getContext();

	/** Setter for field context */
	void setContext(Map<String, Object> context);
}
