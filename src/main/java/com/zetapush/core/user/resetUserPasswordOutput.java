package com.zetapush.core.user;


/** Result of the call to macro 'resetUserPassword' */
public class resetUserPasswordOutput {
	private User user;

	/** Default constructor */
	public resetUserPasswordOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param user
	 *        
	 */
	public resetUserPasswordOutput(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	/** Field user
	 * 
	*/
	public void setUser(User user) {
		this.user = user;
	}

	public String toString() { 
		return "resetUserPasswordOutput[user=" + user + "]";
	}
}
