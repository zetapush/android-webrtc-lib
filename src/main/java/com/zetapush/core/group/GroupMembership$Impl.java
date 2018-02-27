package com.zetapush.core.group;



public class GroupMembership$Impl implements GroupMembership {
	private Boolean member;

	/** Default constructor */
	public GroupMembership$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param member
	 *        Is member of group
	 */
	public GroupMembership$Impl(Boolean member) {
		this.member = member;
	}

	public Boolean isMember() {
		return member;
	}

	/** Field member
	 * Is member of group
	*/
	public void setMember(Boolean member) {
		this.member = member;
	}

	public String toString() { 
		return "GroupMembership$Impl[member=" + member + "]";
	}
}
