package com.zetapush.core.utils;



public class Storable$Impl implements Storable {
	private String id;
	private Number revision;
	private Number update;

	/** Default constructor */
	public Storable$Impl() {
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
	 */
	public Storable$Impl(String id, Number revision, Number update) {
		this.id = id;
		this.revision = revision;
		this.update = update;
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

	public String toString() { 
		return "Storable$Impl[id=" + id + ", revision=" + revision + ", update=" + update + "]";
	}
}
