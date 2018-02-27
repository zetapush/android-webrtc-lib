package com.zetapush.core.room;



public class addRoomMemberInput$Impl implements addRoomMemberInput {
	private String id;
	private String member;

	/** Default constructor */
	public addRoomMemberInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 * @param member
	 *        User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public addRoomMemberInput$Impl(String id, String member) {
		this.id = id;
		this.member = member;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Room id<br>Validation constraints : <ul>
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

	public String getMember() {
		return member;
	}

	/** Field member
	 * User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setMember(String member) {
		this.member = member;
	}

	public String toString() { 
		return "addRoomMemberInput$Impl[id=" + id + ", member=" + member + "]";
	}
}
