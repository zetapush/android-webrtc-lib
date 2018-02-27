package com.zetapush.core.file;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.file.FileUrl$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.file.FileUrl$Impl.class, name = "com.zetapush.core.file.FileUrl") })
public interface FileUrl {
}
