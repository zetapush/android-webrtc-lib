package com.zetapush.core.visio;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/** 
 *	Macroscript called when the call is accepted.
 *	We change the state of the call in the database
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.visio.setCallAcceptedInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.visio.setCallAcceptedInput$Impl.class, name = "com.zetapush.core.visio.setCallAcceptedInput") })
public interface setCallAcceptedInput {

	/** Getter for field id
	 * ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);
}
