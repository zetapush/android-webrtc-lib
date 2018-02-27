package com.zetapush.core.user;


/** Result of the call to macro 'core_user__getUserByUserKey' */
public class core_user__getUserByUserKeyOutput {
	private User user;

	/** Default constructor */
	public core_user__getUserByUserKeyOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param user
	 *        
	 */
	public core_user__getUserByUserKeyOutput(User user) {
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
		return "core_user__getUserByUserKeyOutput[user=" + user + "]";
	}
}
