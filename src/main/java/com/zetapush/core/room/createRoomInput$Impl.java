package com.zetapush.core.room;

import java.util.List;


public class createRoomInput$Impl implements createRoomInput {
	private String name;
	private List members;

	/** Default constructor */
	public createRoomInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param name
	 *        Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param members
	 *        Room room members<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public createRoomInput$Impl(String name, List members) {
		this.name = name;
		this.members = members;
	}

	public String getName() {
		return name;
	}

	/** Field name
	 * Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setName(String name) {
		this.name = name;
	}

	public List getMembers() {
		return members;
	}

	/** Field members
	 * Room room members<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setMembers(List members) {
		this.members = members;
	}

	public String toString() { 
		return "createRoomInput$Impl[name=" + name + ", members=" + members + "]";
	}
}
