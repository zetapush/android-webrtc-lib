package com.zetapush.core.user;



public class User$Impl implements User {
	private String userKey;
	private String login;

	/** Default constructor */
	public User$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param userKey
	 *        
	 * @param login
	 *        
	 */
	public User$Impl(String userKey, String login) {
		this.userKey = userKey;
		this.login = login;
	}

	public String getUserKey() {
		return userKey;
	}

	/** Field userKey
	 * 
	*/
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public String getLogin() {
		return login;
	}

	/** Field login
	 * 
	*/
	public void setLogin(String login) {
		this.login = login;
	}

	public String toString() { 
		return "User$Impl[userKey=" + userKey + ", login=" + login + "]";
	}
}
