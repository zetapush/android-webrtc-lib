package com.zetapush.core.utils;


/** Result of the call to macro 'removeMetadata' */
public class removeMetadataOutput {
	private String id;

	/** Default constructor */
	public removeMetadataOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        
	 */
	public removeMetadataOutput(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * 
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String toString() { 
		return "removeMetadataOutput[id=" + id + "]";
	}
}
