package com.zetapush.core.group;


/** Result of the call to macro 'core_group__createGroupByService' */
public class core_group__createGroupByServiceOutput {
	private Group group;

	/** Default constructor */
	public core_group__createGroupByServiceOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param group
	 *        
	 */
	public core_group__createGroupByServiceOutput(Group group) {
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
		return "core_group__createGroupByServiceOutput[group=" + group + "]";
	}
}
