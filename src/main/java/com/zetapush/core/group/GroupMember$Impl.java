package com.zetapush.core.group;



public class GroupMember$Impl implements GroupMember {
	private String id;
	private String member;
	private String resource;

	/** Default constructor */
	public GroupMember$Impl() {
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
	 * @param resource
	 *        Group resource<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public GroupMember$Impl(String id, String member, String resource) {
		this.id = id;
		this.member = member;
		this.resource = resource;
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

	public String getResource() {
		return resource;
	}

	/** Field resource
	 * Group resource<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setResource(String resource) {
		this.resource = resource;
	}

	public String toString() { 
		return "GroupMember$Impl[id=" + id + ", member=" + member + ", resource=" + resource + "]";
	}
}
