package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.Map;

/**
 * Create a new ZetaPush with a credentials based authentication
 * User profile can be customized with the followings config variables:
 * <ul>
 *	<li><strong>@config.authentication.simple.mandatory_fields</strong> Add mandatory fields to user profile (default is email)</li>
 *	<li><strong>@config.authentication.simple.public_fields</strong> Add public fields to user profile (defaults are email,firstname,lastname,mobilenumber,phonenumber,birthday,avatar,biography)</li>
 * </ul>
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.createUserInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.createUserInput$Impl.class, name = "com.zetapush.core.user.createUserInput") })
public interface createUserInput {

	/** Getter for field login
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getLogin();

	/** Setter for field login */
	void setLogin(String login);

	/** Getter for field password
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getPassword();

	/** Setter for field password */
	void setPassword(String password);

	/** Getter for field fields
	 * Extra mandatory fields for user profile<br>Validation constraints : <ul>
<li>Constraint <b>@AuthMandatoryFields</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	Map<String, Object> getFields();

	/** Setter for field fields */
	void setFields(Map<String, Object> fields);
}
