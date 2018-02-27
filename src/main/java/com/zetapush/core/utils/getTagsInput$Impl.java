package com.zetapush.core.utils;



public class getTagsInput$Impl implements getTagsInput {
	private String id;

	/** Default constructor */
	public getTagsInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public getTagsInput$Impl(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String toString() { 
		return "getTagsInput$Impl[id=" + id + "]";
	}
}
