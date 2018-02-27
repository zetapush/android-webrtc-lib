package com.zetapush.core.file;



public class getFileEntryInput$Impl implements getFileEntryInput {
	private String path;
	private String owner;

	/** Default constructor */
	public getFileEntryInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param path
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 */
	public getFileEntryInput$Impl(String path, String owner) {
		this.path = path;
		this.owner = owner;
	}

	public String getPath() {
		return path;
	}

	/** Field path
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setPath(String path) {
		this.path = path;
	}

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * 
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String toString() { 
		return "getFileEntryInput$Impl[path=" + path + ", owner=" + owner + "]";
	}
}
