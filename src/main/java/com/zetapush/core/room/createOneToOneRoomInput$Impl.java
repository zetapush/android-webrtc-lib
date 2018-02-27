package com.zetapush.core.room;



public class createOneToOneRoomInput$Impl implements createOneToOneRoomInput {
	private String interlocutor;

	/** Default constructor */
	public createOneToOneRoomInput$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param interlocutor
	 *        Room interlocutor<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public createOneToOneRoomInput$Impl(String interlocutor) {
		this.interlocutor = interlocutor;
	}

	public String getInterlocutor() {
		return interlocutor;
	}

	/** Field interlocutor
	 * Room interlocutor<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setInterlocutor(String interlocutor) {
		this.interlocutor = interlocutor;
	}

	public String toString() { 
		return "createOneToOneRoomInput$Impl[interlocutor=" + interlocutor + "]";
	}
}
