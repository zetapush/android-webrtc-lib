package com.zetapush.core.user;



public class resetUserPasswordByLoginInput$Impl implements resetUserPasswordByLoginInput {
	private String login;

	/** Default constructor */
	public resetUserPasswordByLoginInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param login
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public resetUserPasswordByLoginInput$Impl(String login) {
		this.login = login;
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

	public String toString() { 
		return "resetUserPasswordByLoginInput$Impl[login=" + login + "]";
	}
}
