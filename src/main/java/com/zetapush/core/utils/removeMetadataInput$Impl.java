package com.zetapush.core.utils;



public class removeMetadataInput$Impl implements removeMetadataInput {
	private String id;

	/** Default constructor */
	public removeMetadataInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public removeMetadataInput$Impl(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String toString() { 
		return "removeMetadataInput$Impl[id=" + id + "]";
	}
}
