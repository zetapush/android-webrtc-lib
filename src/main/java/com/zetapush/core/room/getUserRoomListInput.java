package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.zetapush.core.utils.Pagination;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.getUserRoomListInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.getUserRoomListInput$Impl.class, name = "com.zetapush.core.room.getUserRoomListInput") })
public interface getUserRoomListInput {

	/** Getter for field page
	 * Pagination object
	 */
	Pagination getPage();

	/** Setter for field page */
	void setPage(Pagination page);
}
