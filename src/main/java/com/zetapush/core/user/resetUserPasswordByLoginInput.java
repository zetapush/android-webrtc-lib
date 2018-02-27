package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/** Synthetic type for input parameters of macro 'resetUserPasswordByLogin' */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.resetUserPasswordByLoginInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.resetUserPasswordByLoginInput$Impl.class, name = "com.zetapush.core.user.resetUserPasswordByLoginInput") })
public interface resetUserPasswordByLoginInput {

	/** Getter for field login
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getLogin();

	/** Setter for field login */
	void setLogin(String login);
}
