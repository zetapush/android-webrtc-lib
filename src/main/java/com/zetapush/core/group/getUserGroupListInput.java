package com.zetapush.core.group;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Get all the groups user is part of
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.group.getUserGroupListInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.group.getUserGroupListInput$Impl.class, name = "com.zetapush.core.group.getUserGroupListInput") })
public interface getUserGroupListInput {
}
