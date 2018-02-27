package com.zetapush.core.visio;

import java.util.List;

/** Result of the call to macro 'getMissedCallByUser' */
public class getMissedCallByUserOutput {
	private List listMissedCalls;

	/** Default constructor */
	public getMissedCallByUserOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param listMissedCalls
	 *        
	 */
	public getMissedCallByUserOutput(List listMissedCalls) {
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
		return "getMissedCallByUserOutput[listMissedCalls=" + listMissedCalls + "]";
	}
}
