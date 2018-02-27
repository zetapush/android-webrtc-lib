package com.zetapush.core.user;



public class resetUserPasswordInput$Impl implements resetUserPasswordInput {
	private String userKey;

	/** Default constructor */
	public resetUserPasswordInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param userKey
	 *        
	 */
	public resetUserPasswordInput$Impl(String userKey) {
		this.userKey = userKey;
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

	public String toString() { 
		return "resetUserPasswordInput$Impl[userKey=" + userKey + "]";
	}
}
