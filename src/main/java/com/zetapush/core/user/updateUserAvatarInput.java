package com.zetapush.core.user;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

/**
 * Set avatar in user profile
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.user.updateUserAvatarInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.user.updateUserAvatarInput$Impl.class, name = "com.zetapush.core.user.updateUserAvatarInput") })
public interface updateUserAvatarInput {

	/** Getter for field path
	 * File path<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getPath();

	/** Setter for field path */
	void setPath(String path);
}
