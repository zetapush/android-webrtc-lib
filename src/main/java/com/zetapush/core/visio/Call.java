package com.zetapush.core.visio;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import java.util.Map;

/**
 *	Define a call
 *	A Call state can be (calling / missed / refused / accepted / terminated)
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.visio.Call$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.visio.Call$Impl.class, name = "com.zetapush.core.visio.Call") })
public interface Call {

	/** Getter for field id
	 * ID of the call
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field state
	 * State of the call
	 */
	String getState();

	/** Setter for field state */
	void setState(String state);

	/** Getter for field caller
	 * userKey of the user that create this call
	 */
	String getCaller();

	/** Setter for field caller */
	void setCaller(String caller);

	/** Getter for field called
	 * ID of the group that receive this call
	 */
	String getCalled();

	/** Setter for field called */
	void setCalled(String called);

	/** Getter for field context
	 * Generic call context
	 */
	Map<String, Object> getContext();

	/** Setter for field context */
	void setContext(Map<String, Object> context);
}
