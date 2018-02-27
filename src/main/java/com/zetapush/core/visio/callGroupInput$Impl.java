package com.zetapush.core.visio;

import java.util.Map;


public class callGroupInput$Impl implements callGroupInput {
	private String id;
	private Map<String, Object> context;

	/** Default constructor */
	public callGroupInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        ID of the group we want to call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param context
	 *        Generic call context
	 */
	public callGroupInput$Impl(String id, Map<String, Object> context) {
		this.id = id;
		this.context = context;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * ID of the group we want to call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public Map<String, Object> getContext() {
		return context;
	}

	/** Field context
	 * Generic call context
	*/
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}

	public String toString() { 
		return "callGroupInput$Impl[id=" + id + ", context=" + context + "]";
	}
}
