package com.zetapush.core.group;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Get all user groups
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.group.getGroupListInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.group.getGroupListInput$Impl.class, name = "com.zetapush.core.group.getGroupListInput") })
public interface getGroupListInput {
}
