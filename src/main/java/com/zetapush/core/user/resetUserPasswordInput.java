package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/** Synthetic type for input parameters of macro 'resetUserPassword' */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.resetUserPasswordInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.resetUserPasswordInput$Impl.class, name = "com.zetapush.core.user.resetUserPasswordInput") })
public interface resetUserPasswordInput {

	/** Getter for field userKey
	 * 
	 */
	String getUserKey();

	/** Setter for field userKey */
	void setUserKey(String userKey);
}
