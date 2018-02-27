package com.zetapush.core.file;

import java.util.List;


public class FileEntryList$Impl implements FileEntryList {
	private Boolean exists;
	private String folder;
	private List<FileEntryInfo> entries;
	private String owner;

	/** Default constructor */
	public FileEntryList$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param exists
	 *        
	 * @param folder
	 *        
	 * @param entries
	 *        
	 * @param owner
	 *        
	 */
	public FileEntryList$Impl(Boolean exists, String folder, List<FileEntryInfo> entries, String owner) {
		this.exists = exists;
		this.folder = folder;
		this.entries = entries;
		this.owner = owner;
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

	public String getFolder() {
		return folder;
	}

	/** Field folder
	 * 
	*/
	public void setFolder(String folder) {
		this.folder = folder;
	}

	public List<FileEntryInfo> getEntries() {
		return entries;
	}

	/** Field entries
	 * 
	*/
	public void setEntries(List<FileEntryInfo> entries) {
		this.entries = entries;
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
		return "FileEntryList$Impl[exists=" + exists + ", folder=" + folder + ", entries=" + entries + ", owner=" + owner + "]";
	}
}
