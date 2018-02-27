package com.zetapush.core.group;

import java.util.List;
import java.util.Map;
/** Factory for object instantiation */
public class GroupObjectFactory {
	/** factory for new getGroupListInput instances */
	public static getGroupListInput creategetGroupListInput () {
		return new getGroupListInput$Impl();
	}
	/** factory for new isMemberOfInput instances */
	public static isMemberOfInput createisMemberOfInput () {
		return new isMemberOfInput$Impl();
	}
	/**
	 * factory method with all parameters for isMemberOfInput
	 *
	 * @param id
	 *        Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        Group owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param isHardFail
	 *        Is hard fail mode<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static isMemberOfInput createisMemberOfInput(String id, String owner, Boolean isHardFail) {
		return new isMemberOfInput$Impl(id, owner, isHardFail);
	}
	/** factory for new addGroupMemberInput instances */
	public static addGroupMemberInput createaddGroupMemberInput () {
		return new addGroupMemberInput$Impl();
	}
	/**
	 * factory method with all parameters for addGroupMemberInput
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
	public static addGroupMemberInput createaddGroupMemberInput(String id, String member) {
		return new addGroupMemberInput$Impl(id, member);
	}
	/** factory for new GroupMembership instances */
	public static GroupMembership createGroupMembership () {
		return new GroupMembership$Impl();
	}
	/**
	 * factory method with all parameters for GroupMembership
	 *
	 * @param member
	 *        Is member of group
	 */
	public static GroupMembership createGroupMembership(Boolean member) {
		return new GroupMembership$Impl(member);
	}
	/** factory for new deleteGroupInput instances */
	public static deleteGroupInput createdeleteGroupInput () {
		return new deleteGroupInput$Impl();
	}
	/**
	 * factory method with all parameters for deleteGroupInput
	 *
	 * @param id
	 *        Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static deleteGroupInput createdeleteGroupInput(String id) {
		return new deleteGroupInput$Impl(id);
	}
	/** factory for new Group instances */
	public static Group createGroup () {
		return new Group$Impl();
	}
	/**
	 * factory method with all parameters for Group
	 *
	 * @param id
	 *        Group id
	 * @param deploymentId
	 *        Group deployment id
	 * @param name
	 *        Group name
	 * @param owner
	 *        Group owner
	 * @param resource
	 *        Group resource
	 * @param members
	 *        Group members
	 * @param metadata
	 *        Group metadata
	 * @param tags
	 *        Group tags
	 */
	public static Group createGroup(String id, String deploymentId, String name, String owner, String resource, List members, Map<String, Object> metadata, List<String> tags) {
		return new Group$Impl(id, deploymentId, name, owner, resource, members, metadata, tags);
	}
	/** factory for new getGroupInput instances */
	public static getGroupInput creategetGroupInput () {
		return new getGroupInput$Impl();
	}
	/**
	 * factory method with all parameters for getGroupInput
	 *
	 * @param id
	 *        Group id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static getGroupInput creategetGroupInput(String id) {
		return new getGroupInput$Impl(id);
	}
	/** factory for new removeGroupMemberInput instances */
	public static removeGroupMemberInput createremoveGroupMemberInput () {
		return new removeGroupMemberInput$Impl();
	}
	/**
	 * factory method with all parameters for removeGroupMemberInput
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
	public static removeGroupMemberInput createremoveGroupMemberInput(String id, String member) {
		return new removeGroupMemberInput$Impl(id, member);
	}
	/** factory for new createGroupInput instances */
	public static createGroupInput createcreateGroupInput () {
		return new createGroupInput$Impl();
	}
	/**
	 * factory method with all parameters for createGroupInput
	 *
	 * @param id
	 *        Optionnal group id
	 * @param name
	 *        Mandatory group name<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param members
	 *        Optionnal group members
	 * @param metadata
	 *        Optionnal group metadata
	 * @param tags
	 *        Optionnal group tags
	 */
	public static createGroupInput createcreateGroupInput(String id, String name, List members, Map<String, Object> metadata, List tags) {
		return new createGroupInput$Impl(id, name, members, metadata, tags);
	}
	/** factory for new GroupMember instances */
	public static GroupMember createGroupMember () {
		return new GroupMember$Impl();
	}
	/**
	 * factory method with all parameters for GroupMember
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
	public static GroupMember createGroupMember(String id, String member, String resource) {
		return new GroupMember$Impl(id, member, resource);
	}
	/** factory for new getUserGroupListInput instances */
	public static getUserGroupListInput creategetUserGroupListInput () {
		return new getUserGroupListInput$Impl();
	}
}
