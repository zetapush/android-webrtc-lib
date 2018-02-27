package com.zetapush.core.visio;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/** 
 *	Macroscript that used to send the call object as a missed call.
 *	The client need to listen this macroscript to handle missed calls
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.visio.addToMissedCallInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.visio.addToMissedCallInput$Impl.class, name = "com.zetapush.core.visio.addToMissedCallInput") })
public interface addToMissedCallInput {

	/** Getter for field callObject
	 * Call object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Call getCallObject();

	/** Setter for field callObject */
	void setCallObject(Call callObject);
}
