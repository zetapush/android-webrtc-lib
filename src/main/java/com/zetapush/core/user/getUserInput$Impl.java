package com.zetapush.core.user;



public class getUserInput$Impl implements getUserInput {
	private String userKey;

	/** Default constructor */
	public getUserInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param userKey
	 *        (Optional) ZetaPush user key
	 */
	public getUserInput$Impl(String userKey) {
		this.userKey = userKey;
	}

	public String getUserKey() {
		return userKey;
	}

	/** Field userKey
	 * (Optional) ZetaPush user key
	*/
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public String toString() { 
		return "getUserInput$Impl[userKey=" + userKey + "]";
	}
}
