package com.zetapush.core.utils;


/** Result of the call to macro 'removeTags' */
public class removeTagsOutput {
	private String id;

	/** Default constructor */
	public removeTagsOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        
	 */
	public removeTagsOutput(String id) {
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
		return "removeTagsOutput[id=" + id + "]";
	}
}
