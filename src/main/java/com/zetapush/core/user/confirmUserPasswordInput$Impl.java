package com.zetapush.core.user;



public class confirmUserPasswordInput$Impl implements confirmUserPasswordInput {
	private String password;
	private String token;

	/** Default constructor */
	public confirmUserPasswordInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param password
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param token
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public confirmUserPasswordInput$Impl(String password, String token) {
		this.password = password;
		this.token = token;
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

	public String getToken() {
		return token;
	}

	/** Field token
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setToken(String token) {
		this.token = token;
	}

	public String toString() { 
		return "confirmUserPasswordInput$Impl[password=" + password + ", token=" + token + "]";
	}
}
