package com.zetapush.core.file;



public class requestFileUploadInput$Impl implements requestFileUploadInput {
	private String contentType;
	private String folder;
	private String owner;

	/** Default constructor */
	public requestFileUploadInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param contentType
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param folder
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 */
	public requestFileUploadInput$Impl(String contentType, String folder, String owner) {
		this.contentType = contentType;
		this.folder = folder;
		this.owner = owner;
	}

	public String getContentType() {
		return contentType;
	}

	/** Field contentType
	 * <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setContentType(String contentType) {
		this.contentType = contentType;
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
		return "requestFileUploadInput$Impl[contentType=" + contentType + ", folder=" + folder + ", owner=" + owner + "]";
	}
}
