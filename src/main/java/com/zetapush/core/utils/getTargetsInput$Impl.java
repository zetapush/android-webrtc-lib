package com.zetapush.core.utils;



public class getTargetsInput$Impl implements getTargetsInput {
	private String id;

	/** Default constructor */
	public getTargetsInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public getTargetsInput$Impl(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String toString() { 
		return "getTargetsInput$Impl[id=" + id + "]";
	}
}
