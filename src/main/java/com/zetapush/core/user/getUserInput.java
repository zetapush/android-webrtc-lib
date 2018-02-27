package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Get user profile according to the given user key
 * <strong>UserKey is not the login used to connect the user</strong>
 * To get a user profile based on the login value, you have to call <a href="./getUserbyLogin.html">getUserbyLogin()</a>
 * User Key is the uniq key associted to each ZetaPush user. You can acces to this value with special keyword <strong>__userKey</strong>
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.getUserInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.getUserInput$Impl.class, name = "com.zetapush.core.user.getUserInput") })
public interface getUserInput {

	/** Getter for field userKey
	 * (Optional) ZetaPush user key
	 */
	String getUserKey();

	/** Setter for field userKey */
	void setUserKey(String userKey);
}
