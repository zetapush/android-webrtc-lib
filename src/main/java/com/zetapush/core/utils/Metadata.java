package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.Metadata$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.Metadata$Impl.class, name = "com.zetapush.core.utils.Metadata") })
public interface Metadata extends Storable {

	/** Getter for field value
	 * Value
	 */
	Map<String, Object> getValue();

	/** Setter for field value */
	void setValue(Map<String, Object> value);
}
