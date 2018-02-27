package com.zetapush.core.user;



public class updateUserAvatarInput$Impl implements updateUserAvatarInput {
	private String path;

	/** Default constructor */
	public updateUserAvatarInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param path
	 *        File path<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public updateUserAvatarInput$Impl(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	/** Field path
	 * File path<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setPath(String path) {
		this.path = path;
	}

	public String toString() { 
		return "updateUserAvatarInput$Impl[path=" + path + "]";
	}
}
