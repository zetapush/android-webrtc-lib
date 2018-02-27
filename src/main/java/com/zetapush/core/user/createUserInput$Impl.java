package com.zetapush.core.user;

import java.util.Map;


public class createUserInput$Impl implements createUserInput {
	private String login;
	private String password;
	private Map<String, Object> fields;

	/** Default constructor */
	public createUserInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param login
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param password
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param fields
	 *        Extra mandatory fields for user profile<br>Validation constraints : <ul>
<li>Constraint <b>@AuthMandatoryFields</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public createUserInput$Impl(String login, String password, Map<String, Object> fields) {
		this.login = login;
		this.password = password;
		this.fields = fields;
	}

	public String getLogin() {
		return login;
	}

	/** Field login
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	/** Field password
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getFields() {
		return fields;
	}

	/** Field fields
	 * Extra mandatory fields for user profile<br>Validation constraints : <ul>
<li>Constraint <b>@AuthMandatoryFields</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}

	public String toString() { 
		return "createUserInput$Impl[login=" + login + ", password=" + password + ", fields=" + fields + "]";
	}
}
