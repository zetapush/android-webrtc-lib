package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Confirm the new user password.
 * Token and password are required, token can be retreived via a call on resetUserPassword macro
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.confirmUserPasswordInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.confirmUserPasswordInput$Impl.class, name = "com.zetapush.core.user.confirmUserPasswordInput") })
public interface confirmUserPasswordInput {

	/** Getter for field password
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getPassword();

	/** Setter for field password */
	void setPassword(String password);

	/** Getter for field token
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getToken();

	/** Setter for field token */
	void setToken(String token);
}
