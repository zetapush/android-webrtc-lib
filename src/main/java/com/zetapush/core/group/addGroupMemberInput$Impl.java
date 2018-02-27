package com.zetapush.core.group;



public class addGroupMemberInput$Impl implements addGroupMemberInput {
	private String id;
	private String member;

	/** Default constructor */
	public addGroupMemberInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param member
	 *        User key<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public addGroupMemberInput$Impl(String id, String member) {
		this.id = id;
		this.member = member;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
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
		return "addGroupMemberInput$Impl[id=" + id + ", member=" + member + "]";
	}
}
