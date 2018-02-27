package com.zetapush.core.group;


/** Result of the call to macro 'core_group__deleteGroupByService' */
public class core_group__deleteGroupByServiceOutput {
	private String id;

	/** Default constructor */
	public core_group__deleteGroupByServiceOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        
	 */
	public core_group__deleteGroupByServiceOutput(String id) {
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
		return "core_group__deleteGroupByServiceOutput[id=" + id + "]";
	}
}
