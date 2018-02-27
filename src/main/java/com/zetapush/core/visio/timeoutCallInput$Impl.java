package com.zetapush.core.visio;



public class timeoutCallInput$Impl implements timeoutCallInput {
	private String id;

	/** Default constructor */
	public timeoutCallInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public timeoutCallInput$Impl(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String toString() { 
		return "timeoutCallInput$Impl[id=" + id + "]";
	}
}
