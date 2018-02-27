package com.zetapush.core.visio;


/** Result of the call to macro 'setCallState' */
public class setCallStateOutput {
	private Call callObject;

	/** Default constructor */
	public setCallStateOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param callObject
	 *        
	 */
	public setCallStateOutput(Call callObject) {
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
		return "setCallStateOutput[callObject=" + callObject + "]";
	}
}
