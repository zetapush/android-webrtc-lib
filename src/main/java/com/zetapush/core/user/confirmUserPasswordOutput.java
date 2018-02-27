package com.zetapush.core.user;


/** Result of the call to macro 'confirmUserPassword' */
public class confirmUserPasswordOutput {
	private String password;
	private String token;

	/** Default constructor */
	public confirmUserPasswordOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param password
	 *        
	 * @param token
	 *        
	 */
	public confirmUserPasswordOutput(String password, String token) {
		this.password = password;
		this.token = token;
	}

	public String getPassword() {
		return password;
	}

	/** Field password
	 * 
	*/
	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	/** Field token
	 * 
	*/
	public void setToken(String token) {
		this.token = token;
	}

	public String toString() { 
		return "confirmUserPasswordOutput[password=" + password + ", token=" + token + "]";
	}
}
