package com.zetapush.core.visio;

import java.util.List;

/** Result of the call to macro 'getCurrentCallByUser' */
public class getCurrentCallByUserOutput {
	private List listMissedCalls;

	/** Default constructor */
	public getCurrentCallByUserOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param listMissedCalls
	 *        
	 */
	public getCurrentCallByUserOutput(List listMissedCalls) {
		this.listMissedCalls = listMissedCalls;
	}

	public List getListMissedCalls() {
		return listMissedCalls;
	}

	/** Field listMissedCalls
	 * 
	*/
	public void setListMissedCalls(List listMissedCalls) {
		this.listMissedCalls = listMissedCalls;
	}

	public String toString() { 
		return "getCurrentCallByUserOutput[listMissedCalls=" + listMissedCalls + "]";
	}
}
