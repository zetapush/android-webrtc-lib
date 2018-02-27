package com.zetapush.core.file;


/** Result of the call to macro 'deleteFileEntry' */
public class deleteFileEntryOutput {
	private String path;
	private String owner;

	/** Default constructor */
	public deleteFileEntryOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param path
	 *        
	 * @param owner
	 *        
	 */
	public deleteFileEntryOutput(String path, String owner) {
		this.path = path;
		this.owner = owner;
	}

	public String getPath() {
		return path;
	}

	/** Field path
	 * 
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
		return "deleteFileEntryOutput[path=" + path + ", owner=" + owner + "]";
	}
}
