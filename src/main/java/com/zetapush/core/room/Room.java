package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.zetapush.common.messages.remoting.GrantListItem;
import com.zetapush.core.group.Group;

import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.Room$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.Room$Impl.class, name = "com.zetapush.core.room.Room") })
public interface Room extends Group {

	/** Getter for field grants
	 * 
	 */
	List<GrantListItem> getGrants();

	/** Setter for field grants */
	void setGrants(List<GrantListItem> grants);
}
