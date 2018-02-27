package com.zetapush.core.utils;



public class setTagsInput$Impl implements setTagsInput {
	private String id;
	private String tags;

	/** Default constructor */
	public setTagsInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param tags
	 *        tags value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public setTagsInput$Impl(String id, String tags) {
		this.id = id;
		this.tags = tags;
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

	public String getTags() {
		return tags;
	}

	/** Field tags
	 * tags value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String toString() { 
		return "setTagsInput$Impl[id=" + id + ", tags=" + tags + "]";
	}
}
