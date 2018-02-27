package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;

/**
 * Get list of users according to user keys list
 * Returned list wrap user profile in a ad hoc data structure
 * <pre><code>
 * class UserWrapper {
 *   boolean found;
 *   User user;
 * }
 * </code></pre>
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.getUserListInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.getUserListInput$Impl.class, name = "com.zetapush.core.user.getUserListInput") })
public interface getUserListInput {

	/** Getter for field userKeys
	 * List of userKey<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	List getUserKeys();

	/** Setter for field userKeys */
	void setUserKeys(List userKeys);
}
