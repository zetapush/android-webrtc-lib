package com.zetapush.core.utils;



public class getMetadataInput$Impl implements getMetadataInput {
	private String id;

	/** Default constructor */
	public getMetadataInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public getMetadataInput$Impl(String id) {
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
		return "getMetadataInput$Impl[id=" + id + "]";
	}
}
