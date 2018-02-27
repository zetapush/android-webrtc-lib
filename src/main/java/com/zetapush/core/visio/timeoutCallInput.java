package com.zetapush.core.visio;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 *	Macroscript called after the timeout.
 *	This timeout is used to simulate a call that is ringing on the device
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.visio.timeoutCallInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.visio.timeoutCallInput$Impl.class, name = "com.zetapush.core.visio.timeoutCallInput") })
public interface timeoutCallInput {

	/** Getter for field id
	 * ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);
}
