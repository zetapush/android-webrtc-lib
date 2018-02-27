package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Get user profile according to the login use to connect the user
 * <strong>Login is not the user key of the user</strong>
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.getUserByLoginInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.getUserByLoginInput$Impl.class, name = "com.zetapush.core.user.getUserByLoginInput") })
public interface getUserByLoginInput {

	/** Getter for field login
	 * User login<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getLogin();

	/** Setter for field login */
	void setLogin(String login);
}
