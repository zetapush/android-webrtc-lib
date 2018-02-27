package com.zetapush.core.group;



public class isMemberOfInput$Impl implements isMemberOfInput {
	private String id;
	private String owner;
	private Boolean isHardFail;

	/** Default constructor */
	public isMemberOfInput$Impl() {
	}
	/**
	 * All args constructor
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
	public isMemberOfInput$Impl(String id, String owner, Boolean isHardFail) {
		this.id = id;
		this.owner = owner;
		this.isHardFail = isHardFail;
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

	public String getOwner() {
		return owner;
	}

	/** Field owner
	 * Group owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Boolean isIsHardFail() {
		return isHardFail;
	}

	/** Field isHardFail
	 * Is hard fail mode<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	*/
	public void setIsHardFail(Boolean isHardFail) {
		this.isHardFail = isHardFail;
	}

	public String toString() { 
		return "isMemberOfInput$Impl[id=" + id + ", owner=" + owner + ", isHardFail=" + isHardFail + "]";
	}
}
