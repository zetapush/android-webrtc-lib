package com.zetapush.core.visio;

import com.zetapush.core.utils.Pagination;


public class getMissedCallByUserInput$Impl implements getMissedCallByUserInput {
	private String userKey;
	private Pagination page;

	/** Default constructor */
	public getMissedCallByUserInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param userKey
	 *        UserKey of the user<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param page
	 *        Pagination object
	 */
	public getMissedCallByUserInput$Impl(String userKey, Pagination page) {
		this.userKey = userKey;
		this.page = page;
	}

	public String getUserKey() {
		return userKey;
	}

	/** Field userKey
	 * UserKey of the user<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public Pagination getPage() {
		return page;
	}

	/** Field page
	 * Pagination object
	*/
	public void setPage(Pagination page) {
		this.page = page;
	}

	public String toString() { 
		return "getMissedCallByUserInput$Impl[userKey=" + userKey + ", page=" + page + "]";
	}
}
