package com.zetapush.core.group;



public class deleteGroupInput$Impl implements deleteGroupInput {
	private String id;

	/** Default constructor */
	public deleteGroupInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public deleteGroupInput$Impl(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String toString() { 
		return "deleteGroupInput$Impl[id=" + id + "]";
	}
}
