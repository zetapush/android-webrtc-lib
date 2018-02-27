package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.Tags$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.Tags$Impl.class, name = "com.zetapush.core.utils.Tags") })
public interface Tags extends Storable {

	/** Getter for field value
	 * Value
	 */
	List<String> getValue();

	/** Setter for field value */
	void setValue(List<String> value);
}
