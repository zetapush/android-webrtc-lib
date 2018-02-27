package com.zetapush.core.user;

import java.util.List;
import java.util.Map;
/** Factory for object instantiation */
public class UserObjectFactory {
	/** factory for new resetUserPasswordByLoginInput instances */
	public static resetUserPasswordByLoginInput createresetUserPasswordByLoginInput () {
		return new resetUserPasswordByLoginInput$Impl();
	}
	/**
	 * factory method with all parameters for resetUserPasswordByLoginInput
	 *
	 * @param login
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static resetUserPasswordByLoginInput createresetUserPasswordByLoginInput(String login) {
		return new resetUserPasswordByLoginInput$Impl(login);
	}
	/** factory for new getUserByLoginInput instances */
	public static getUserByLoginInput creategetUserByLoginInput () {
		return new getUserByLoginInput$Impl();
	}
	/**
	 * factory method with all parameters for getUserByLoginInput
	 *
	 * @param login
	 *        User login<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static getUserByLoginInput creategetUserByLoginInput(String login) {
		return new getUserByLoginInput$Impl(login);
	}
	/** factory for new confirmUserPasswordInput instances */
	public static confirmUserPasswordInput createconfirmUserPasswordInput () {
		return new confirmUserPasswordInput$Impl();
	}
	/**
	 * factory method with all parameters for confirmUserPasswordInput
	 *
	 * @param password
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param token
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static confirmUserPasswordInput createconfirmUserPasswordInput(String password, String token) {
		return new confirmUserPasswordInput$Impl(password, token);
	}
	/** factory for new updateUserAvatarInput instances */
	public static updateUserAvatarInput createupdateUserAvatarInput () {
		return new updateUserAvatarInput$Impl();
	}
	/**
	 * factory method with all parameters for updateUserAvatarInput
	 *
	 * @param path
	 *        File path<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static updateUserAvatarInput createupdateUserAvatarInput(String path) {
		return new updateUserAvatarInput$Impl(path);
	}
	/** factory for new getUserListInput instances */
	public static getUserListInput creategetUserListInput () {
		return new getUserListInput$Impl();
	}
	/**
	 * factory method with all parameters for getUserListInput
	 *
	 * @param userKeys
	 *        List of userKey<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static getUserListInput creategetUserListInput(List userKeys) {
		return new getUserListInput$Impl(userKeys);
	}
	/** factory for new resetUserPasswordInput instances */
	public static resetUserPasswordInput createresetUserPasswordInput () {
		return new resetUserPasswordInput$Impl();
	}
	/**
	 * factory method with all parameters for resetUserPasswordInput
	 *
	 * @param userKey
	 *        
	 */
	public static resetUserPasswordInput createresetUserPasswordInput(String userKey) {
		return new resetUserPasswordInput$Impl(userKey);
	}
	/** factory for new User instances */
	public static User createUser () {
		return new User$Impl();
	}
	/**
	 * factory method with all parameters for User
	 *
	 * @param userKey
	 *        
	 * @param login
	 *        
	 */
	public static User createUser(String userKey, String login) {
		return new User$Impl(userKey, login);
	}
	/** factory for new getUserInput instances */
	public static getUserInput creategetUserInput () {
		return new getUserInput$Impl();
	}
	/**
	 * factory method with all parameters for getUserInput
	 *
	 * @param userKey
	 *        (Optional) ZetaPush user key
	 */
	public static getUserInput creategetUserInput(String userKey) {
		return new getUserInput$Impl(userKey);
	}
	/** factory for new updateUserInput instances */
	public static updateUserInput createupdateUserInput () {
		return new updateUserInput$Impl();
	}
	/**
	 * factory method with all parameters for updateUserInput
	 *
	 * @param login
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param fields
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@AuthMandatoryFields</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static updateUserInput createupdateUserInput(String login, Map<String, Object> fields) {
		return new updateUserInput$Impl(login, fields);
	}
	/** factory for new createUserInput instances */
	public static createUserInput createcreateUserInput () {
		return new createUserInput$Impl();
	}
	/**
	 * factory method with all parameters for createUserInput
	 *
	 * @param login
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param password
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param fields
	 *        Extra mandatory fields for user profile<br>Validation constraints : <ul>
<li>Constraint <b>@AuthMandatoryFields</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static createUserInput createcreateUserInput(String login, String password, Map<String, Object> fields) {
		return new createUserInput$Impl(login, password, fields);
	}
}
