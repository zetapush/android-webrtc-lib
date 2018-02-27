package com.zetapush.core.utils;


/** Result of the call to macro 'removeTargets' */
public class removeTargetsOutput {
	private String id;

	/** Default constructor */
	public removeTargetsOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        
	 */
	public removeTargetsOutput(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * 
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String toString() { 
		return "removeTargetsOutput[id=" + id + "]";
	}
}
