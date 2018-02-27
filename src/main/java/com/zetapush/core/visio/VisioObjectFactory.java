package com.zetapush.core.visio;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.zetapush.core.utils.Pagination;
import java.util.Map;
/** Factory for object instantiation */
public class VisioObjectFactory {
	/** factory for new addToMissedCallInput instances */
	public static addToMissedCallInput createaddToMissedCallInput () {
		return new addToMissedCallInput$Impl();
	}
	/**
	 * factory method with all parameters for addToMissedCallInput
	 *
	 * @param callObject
	 *        Call object<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static addToMissedCallInput createaddToMissedCallInput(Call callObject) {
		return new addToMissedCallInput$Impl(callObject);
	}
	/** factory for new setCallRefusedInput instances */
	public static setCallRefusedInput createsetCallRefusedInput () {
		return new setCallRefusedInput$Impl();
	}
	/**
	 * factory method with all parameters for setCallRefusedInput
	 *
	 * @param id
	 *        ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static setCallRefusedInput createsetCallRefusedInput(String id) {
		return new setCallRefusedInput$Impl(id);
	}
	/** factory for new getCurrentCallByUserInput instances */
	public static getCurrentCallByUserInput creategetCurrentCallByUserInput () {
		return new getCurrentCallByUserInput$Impl();
	}
	/**
	 * factory method with all parameters for getCurrentCallByUserInput
	 *
	 * @param userKey
	 *        UserKey of the user<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param page
	 *        Pagination object
	 */
	public static getCurrentCallByUserInput creategetCurrentCallByUserInput(String userKey, Pagination page) {
		return new getCurrentCallByUserInput$Impl(userKey, page);
	}
	/** factory for new timeoutCallInput instances */
	public static timeoutCallInput createtimeoutCallInput () {
		return new timeoutCallInput$Impl();
	}
	/**
	 * factory method with all parameters for timeoutCallInput
	 *
	 * @param id
	 *        ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static timeoutCallInput createtimeoutCallInput(String id) {
		return new timeoutCallInput$Impl(id);
	}
	/** factory for new setCallAcceptedInput instances */
	public static setCallAcceptedInput createsetCallAcceptedInput () {
		return new setCallAcceptedInput$Impl();
	}
	/**
	 * factory method with all parameters for setCallAcceptedInput
	 *
	 * @param id
	 *        ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static setCallAcceptedInput createsetCallAcceptedInput(String id) {
		return new setCallAcceptedInput$Impl(id);
	}
	/** factory for new setCallTerminatedInput instances */
	public static setCallTerminatedInput createsetCallTerminatedInput () {
		return new setCallTerminatedInput$Impl();
	}
	/**
	 * factory method with all parameters for setCallTerminatedInput
	 *
	 * @param id
	 *        ID of the call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static setCallTerminatedInput createsetCallTerminatedInput(String id) {
		return new setCallTerminatedInput$Impl(id);
	}
	/** factory for new callGroupInput instances */
	public static callGroupInput createcallGroupInput () {
		return new callGroupInput$Impl();
	}
	/**
	 * factory method with all parameters for callGroupInput
	 *
	 * @param id
	 *        ID of the group we want to call<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param context
	 *        Generic call context
	 */
	public static callGroupInput createcallGroupInput(String id, Map<String, Object> context) {
		return new callGroupInput$Impl(id, context);
	}
	/** factory for new getMissedCallByUserInput instances */
	public static getMissedCallByUserInput creategetMissedCallByUserInput () {
		return new getMissedCallByUserInput$Impl();
	}
	/**
	 * factory method with all parameters for getMissedCallByUserInput
	 *
	 * @param userKey
	 *        UserKey of the user<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param page
	 *        Pagination object
	 */
	public static getMissedCallByUserInput creategetMissedCallByUserInput(String userKey, Pagination page) {
		return new getMissedCallByUserInput$Impl(userKey, page);
	}
	/** factory for new Call instances */
	public static Call createCall () {
		return new Call$Impl();
	}
	/**
	 * factory method with all parameters for Call
	 *
	 * @param id
	 *        ID of the call
	 * @param state
	 *        State of the call
	 * @param caller
	 *        userKey of the user that create this call
	 * @param called
	 *        ID of the group that receive this call
	 * @param context
	 *        Generic call context
	 */
	public static Call createCall(String id, String state, String caller, String called, Map<String, Object> context) {
		return new Call$Impl(id, state, caller, called, context);
	}
}
