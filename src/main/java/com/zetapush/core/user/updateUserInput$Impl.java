package com.zetapush.core.user;

import java.util.Map;


public class updateUserInput$Impl implements updateUserInput {
	private String login;
	private Map<String, Object> fields;

	/** Default constructor */
	public updateUserInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param login
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param fields
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@AuthMandatoryFields</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public updateUserInput$Impl(String login, Map<String, Object> fields) {
		this.login = login;
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

	public Map<String, Object> getFields() {
		return fields;
	}

	/** Field fields
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@AuthMandatoryFields</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}

	public String toString() { 
		return "updateUserInput$Impl[login=" + login + ", fields=" + fields + "]";
	}
}
