package com.zetapush.core.visio;

import java.util.Map;


public class Call$Impl implements Call {
	private String id;
	private String state;
	private String caller;
	private String called;
	private Map<String, Object> context;

	/** Default constructor */
	public Call$Impl() {
	}
	/**
	 * All args constructor
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
	public Call$Impl(String id, String state, String caller, String called, Map<String, Object> context) {
		this.id = id;
		this.state = state;
		this.caller = caller;
		this.called = called;
		this.context = context;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * ID of the call
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	/** Field state
	 * State of the call
	*/
	public void setState(String state) {
		this.state = state;
	}

	public String getCaller() {
		return caller;
	}

	/** Field caller
	 * userKey of the user that create this call
	*/
	public void setCaller(String caller) {
		this.caller = caller;
	}

	public String getCalled() {
		return called;
	}

	/** Field called
	 * ID of the group that receive this call
	*/
	public void setCalled(String called) {
		this.called = called;
	}

	public Map<String, Object> getContext() {
		return context;
	}

	/** Field context
	 * Generic call context
	*/
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}

	public String toString() { 
		return "Call$Impl[id=" + id + ", state=" + state + ", caller=" + caller + ", called=" + called + ", context=" + context + "]";
	}
}
