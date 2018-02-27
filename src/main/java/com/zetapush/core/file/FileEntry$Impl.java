package com.zetapush.core.file;



public class FileEntry$Impl implements FileEntry {
	private Boolean exists;
	private FileEntryInfo entry;

	/** Default constructor */
	public FileEntry$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param exists
	 *        
	 * @param entry
	 *        
	 */
	public FileEntry$Impl(Boolean exists, FileEntryInfo entry) {
		this.exists = exists;
		this.entry = entry;
	}

	public Boolean isExists() {
		return exists;
	}

	/** Field exists
	 * 
	*/
	public void setExists(Boolean exists) {
		this.exists = exists;
	}

	public FileEntryInfo getEntry() {
		return entry;
	}

	/** Field entry
	 * 
	*/
	public void setEntry(FileEntryInfo entry) {
		this.entry = entry;
	}

	public String toString() { 
		return "FileEntry$Impl[exists=" + exists + ", entry=" + entry + "]";
	}
}
