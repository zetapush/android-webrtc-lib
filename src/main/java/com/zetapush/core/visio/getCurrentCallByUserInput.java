package com.zetapush.core.visio;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.zetapush.core.utils.Pagination;

/**
 *	Get the list of in progress call by user
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.visio.getCurrentCallByUserInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.visio.getCurrentCallByUserInput$Impl.class, name = "com.zetapush.core.visio.getCurrentCallByUserInput") })
public interface getCurrentCallByUserInput {

	/** Getter for field userKey
	 * UserKey of the user<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getUserKey();

	/** Setter for field userKey */
	void setUserKey(String userKey);

	/** Getter for field page
	 * Pagination object
	 */
	Pagination getPage();

	/** Setter for field page */
	void setPage(Pagination page);
}
