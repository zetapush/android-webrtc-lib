package com.zetapush.core.file;



public class getFileEntryListInput$Impl implements getFileEntryListInput {
	private String folder;
	private String owner;

	/** Default constructor */
	public getFileEntryListInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param folder
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 */
	public getFileEntryListInput$Impl(String folder, String owner) {
		this.folder = folder;
		this.owner = owner;
	}

	public String getFolder() {
		return folder;
	}

	/** Field folder
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setFolder(String folder) {
		this.folder = folder;
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
		return "getFileEntryListInput$Impl[folder=" + folder + ", owner=" + owner + "]";
	}
}
