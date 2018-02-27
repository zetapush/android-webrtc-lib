package com.zetapush.core.room;

import java.util.List;
import java.util.Map;

/** Result of the call to macro 'getUserRoomList' */
public class getUserRoomListOutput {
	private List<Map<String, Object>> list;

	/** Default constructor */
	public getUserRoomListOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param list
	 *        
	 */
	public getUserRoomListOutput(List<Map<String, Object>> list) {
		this.list = list;
	}

	public List<Map<String, Object>> getList() {
		return list;
	}

	/** Field list
	 * 
	*/
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	public String toString() { 
		return "getUserRoomListOutput[list=" + list + "]";
	}
}
