package com.zetapush.core.visio;



public class addToMissedCallInput$Impl implements addToMissedCallInput {
	private Call callObject;

	/** Default constructor */
	public addToMissedCallInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param callObject
	 *        Call object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public addToMissedCallInput$Impl(Call callObject) {
		this.callObject = callObject;
	}

	public Call getCallObject() {
		return callObject;
	}

	/** Field callObject
	 * Call object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setCallObject(Call callObject) {
		this.callObject = callObject;
	}

	public String toString() { 
		return "addToMissedCallInput$Impl[callObject=" + callObject + "]";
	}
}
