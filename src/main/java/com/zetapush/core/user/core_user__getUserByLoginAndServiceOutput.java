package com.zetapush.core.user;


/** Result of the call to macro 'core_user__getUserByLoginAndService' */
public class core_user__getUserByLoginAndServiceOutput {
	private User user;

	/** Default constructor */
	public core_user__getUserByLoginAndServiceOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param user
	 *        
	 */
	public core_user__getUserByLoginAndServiceOutput(User user) {
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
		return "core_user__getUserByLoginAndServiceOutput[user=" + user + "]";
	}
}
