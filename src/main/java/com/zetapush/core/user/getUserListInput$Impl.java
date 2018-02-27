package com.zetapush.core.user;

import java.util.List;


public class getUserListInput$Impl implements getUserListInput {
	private List userKeys;

	/** Default constructor */
	public getUserListInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param userKeys
	 *        List of userKey<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public getUserListInput$Impl(List userKeys) {
		this.userKeys = userKeys;
	}

	public List getUserKeys() {
		return userKeys;
	}

	/** Field userKeys
	 * List of userKey<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setUserKeys(List userKeys) {
		this.userKeys = userKeys;
	}

	public String toString() { 
		return "getUserListInput$Impl[userKeys=" + userKeys + "]";
	}
}
