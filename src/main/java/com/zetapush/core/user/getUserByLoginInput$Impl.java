package com.zetapush.core.user;



public class getUserByLoginInput$Impl implements getUserByLoginInput {
	private String login;

	/** Default constructor */
	public getUserByLoginInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param login
	 *        User login<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public getUserByLoginInput$Impl(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	/** Field login
	 * User login<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setLogin(String login) {
		this.login = login;
	}

	public String toString() { 
		return "getUserByLoginInput$Impl[login=" + login + "]";
	}
}
