package com.zetapush.core.group;


/** Result of the call to macro 'core_group__getGroupByService' */
public class core_group__getGroupByServiceOutput {
	private Group group;

	/** Default constructor */
	public core_group__getGroupByServiceOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param group
	 *        
	 */
	public core_group__getGroupByServiceOutput(Group group) {
		this.group = group;
	}

	public Group getGroup() {
		return group;
	}

	/** Field group
	 * 
	*/
	public void setGroup(Group group) {
		this.group = group;
	}

	public String toString() { 
		return "core_group__getGroupByServiceOutput[group=" + group + "]";
	}
}
