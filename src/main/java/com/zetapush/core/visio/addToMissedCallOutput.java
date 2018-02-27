package com.zetapush.core.visio;


/** Result of the call to macro 'addToMissedCall' */
public class addToMissedCallOutput {
	private Call callObject;

	/** Default constructor */
	public addToMissedCallOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param callObject
	 *        
	 */
	public addToMissedCallOutput(Call callObject) {
		this.callObject = callObject;
	}

	public Call getCallObject() {
		return callObject;
	}

	/** Field callObject
	 * 
	*/
	public void setCallObject(Call callObject) {
		this.callObject = callObject;
	}

	public String toString() { 
		return "addToMissedCallOutput[callObject=" + callObject + "]";
	}
}
