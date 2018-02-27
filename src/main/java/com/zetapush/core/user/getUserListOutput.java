package com.zetapush.core.user;

import java.util.List;

/** Result of the call to macro 'getUserList' */
public class getUserListOutput {
	private List list;

	/** Default constructor */
	public getUserListOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param list
	 *        
	 */
	public getUserListOutput(List list) {
		this.list = list;
	}

	public List getList() {
		return list;
	}

	/** Field list
	 * 
	*/
	public void setList(List list) {
		this.list = list;
	}

	public String toString() { 
		return "getUserListOutput[list=" + list + "]";
	}
}
