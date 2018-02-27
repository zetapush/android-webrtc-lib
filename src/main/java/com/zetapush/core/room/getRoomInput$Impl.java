package com.zetapush.core.room;

import com.zetapush.core.utils.Pagination;


public class getRoomInput$Impl implements getRoomInput {
	private String id;
	private String owner;
	private Pagination page;

	/** Default constructor */
	public getRoomInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Room room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param owner
	 *        Room room owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param page
	 *        Room pagination
	 */
	public getRoomInput$Impl(String id, String owner, Pagination page) {
		this.id = id;
		this.owner = owner;
		this.page = page;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Room room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * Room room owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Pagination getPage() {
		return page;
	}

	/** Field page
	 * Room pagination
	*/
	public void setPage(Pagination page) {
		this.page = page;
	}

	public String toString() { 
		return "getRoomInput$Impl[id=" + id + ", owner=" + owner + ", page=" + page + "]";
	}
}
