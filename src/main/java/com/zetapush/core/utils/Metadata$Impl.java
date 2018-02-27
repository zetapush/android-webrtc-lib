package com.zetapush.core.utils;

import java.util.Map;


public class Metadata$Impl implements Metadata {
	private String id;
	private Number revision;
	private Number update;
	private Map<String, Object> value;

	/** Default constructor */
	public Metadata$Impl() {
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
	public Metadata$Impl(String id, Number revision, Number update, Map<String, Object> value) {
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

	public Map<String, Object> getValue() {
		return value;
	}

	/** Field value
	 * Value
	*/
	public void setValue(Map<String, Object> value) {
		this.value = value;
	}

	public String toString() { 
		return "Metadata$Impl[id=" + id + ", revision=" + revision + ", update=" + update + ", value=" + value + "]";
	}
}
