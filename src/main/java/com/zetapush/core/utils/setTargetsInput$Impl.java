package com.zetapush.core.utils;



public class setTargetsInput$Impl implements setTargetsInput {
	private String id;
	private String targets;

	/** Default constructor */
	public setTargetsInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param targets
	 *        Targets value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public setTargetsInput$Impl(String id, String targets) {
		this.id = id;
		this.targets = targets;
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

	public String getTargets() {
		return targets;
	}

	/** Field targets
	 * Targets value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setTargets(String targets) {
		this.targets = targets;
	}

	public String toString() { 
		return "setTargetsInput$Impl[id=" + id + ", targets=" + targets + "]";
	}
}
