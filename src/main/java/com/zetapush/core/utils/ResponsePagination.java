package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.ResponsePagination$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.ResponsePagination$Impl.class, name = "com.zetapush.core.utils.ResponsePagination") })
public interface ResponsePagination extends Pagination {

	/** Getter for field hasNext
	 * true to indicate if there is one more page available, false otherwise
	 */
	Boolean isHasNext();

	/** Setter for field hasNext */
	void setHasNext(Boolean hasNext);
}
