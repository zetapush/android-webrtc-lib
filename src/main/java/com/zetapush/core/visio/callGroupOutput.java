package com.zetapush.core.visio;


/** Result of the call to macro 'callGroup' */
public class callGroupOutput {
	private Call callObject;
	private Object source;

	/** Default constructor */
	public callGroupOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param callObject
	 *        
	 * @param source
	 *        
	 */
	public callGroupOutput(Call callObject, Object source) {
		this.callObject = callObject;
		this.source = source;
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

	public Object getSource() {
		return source;
	}

	/** Field source
	 * 
	*/
	public void setSource(Object source) {
		this.source = source;
	}

	public String toString() { 
		return "callGroupOutput[callObject=" + callObject + ", source=" + source + "]";
	}
}
