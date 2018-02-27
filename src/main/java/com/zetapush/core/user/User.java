package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.User$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.User$Impl.class, name = "com.zetapush.core.user.User") })
public interface User {

	/** Getter for field userKey
	 * 
	 */
	String getUserKey();

	/** Setter for field userKey */
	void setUserKey(String userKey);

	/** Getter for field login
	 * 
	 */
	String getLogin();

	/** Setter for field login */
	void setLogin(String login);
}
