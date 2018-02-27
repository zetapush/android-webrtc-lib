package com.zetapush.core.utils;

import java.util.List;


public class Tags$Impl implements Tags {
	private String id;
	private Number revision;
	private Number update;
	private List<String> value;

	/** Default constructor */
	public Tags$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Id
	 * @param revision
	 *        Revision
	 * @param update
	 *        Update
	 * @param value
	 *        Value
	 */
	public Tags$Impl(String id, Number revision, Number update, List<String> value) {
		this.id = id;
		this.revision = revision;
		this.update = update;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Id
	*/
	public void setId(String id) {
		this.id = id;
	}

	public Number getRevision() {
		return revision;
	}

	/** Field revision
	 * Revision
	*/
	public void setRevision(Number revision) {
		this.revision = revision;
	}

	public Number getUpdate() {
		return update;
	}

	/** Field update
	 * Update
	*/
	public void setUpdate(Number update) {
		this.update = update;
	}

	public List<String> getValue() {
		return value;
	}

	/** Field value
	 * Value
	*/
	public void setValue(List<String> value) {
		this.value = value;
	}

	public String toString() { 
		return "Tags$Impl[id=" + id + ", revision=" + revision + ", update=" + update + ", value=" + value + "]";
	}
}
