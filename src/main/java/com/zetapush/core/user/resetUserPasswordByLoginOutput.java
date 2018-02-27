package com.zetapush.core.user;


/** Result of the call to macro 'resetUserPasswordByLogin' */
public class resetUserPasswordByLoginOutput {
	private User user;

	/** Default constructor */
	public resetUserPasswordByLoginOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param user
	 *        
	 */
	public resetUserPasswordByLoginOutput(User user) {
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
		return "resetUserPasswordByLoginOutput[user=" + user + "]";
	}
}
