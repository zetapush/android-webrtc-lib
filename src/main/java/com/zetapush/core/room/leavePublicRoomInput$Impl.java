package com.zetapush.core.room;



public class leavePublicRoomInput$Impl implements leavePublicRoomInput {
	private String name;

	/** Default constructor */
	public leavePublicRoomInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param name
	 *        Room room name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public leavePublicRoomInput$Impl(String name) {
		this.name = name;
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

	public String toString() { 
		return "leavePublicRoomInput$Impl[name=" + name + "]";
	}
}
