package com.zetapush.core.group;

import java.util.List;

/** Result of the call to macro 'core_group__getGroupListByService' */
public class core_group__getGroupListByServiceOutput {
	private List<Group> list;

	/** Default constructor */
	public core_group__getGroupListByServiceOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param list
	 *        
	 */
	public core_group__getGroupListByServiceOutput(List<Group> list) {
		this.list = list;
	}

	public List<Group> getList() {
		return list;
	}

	/** Field list
	 * 
	*/
	public void setList(List<Group> list) {
		this.list = list;
	}

	public String toString() { 
		return "core_group__getGroupListByServiceOutput[list=" + list + "]";
	}
}
