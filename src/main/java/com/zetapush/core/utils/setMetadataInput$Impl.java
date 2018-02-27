package com.zetapush.core.utils;

import java.util.Map;


public class setMetadataInput$Impl implements setMetadataInput {
	private String id;
	private Map<String, Object> metadata;

	/** Default constructor */
	public setMetadataInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param metadata
	 *        Metadata value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public setMetadataInput$Impl(String id, Map<String, Object> metadata) {
		this.id = id;
		this.metadata = metadata;
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

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/** Field metadata
	 * Metadata value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public String toString() { 
		return "setMetadataInput$Impl[id=" + id + ", metadata=" + metadata + "]";
	}
}
