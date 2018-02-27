package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.Pagination$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.ResponsePagination$Impl.class, name = "com.zetapush.core.utils.ResponsePagination"),
	@Type(value = com.zetapush.core.utils.Pagination$Impl.class, name = "com.zetapush.core.utils.Pagination") })
public interface Pagination {

	/** Getter for field pageSize
	 * page size<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 1
</ul>
<li>Constraint <b>@Max</b> : <br>maximum value for an integer<br><ul>
<li><b>max</b> (maximum value): 200
</ul>
</ul>
	 */
	Number getPageSize();

	/** Setter for field pageSize */
	void setPageSize(Number pageSize);

	/** Getter for field pageNumber
	 * page number<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 0
</ul>
</ul>
	 */
	Number getPageNumber();

	/** Setter for field pageNumber */
	void setPageNumber(Number pageNumber);

	/** Getter for field direction
	 * page direction
	 */
	String getDirection();

	/** Setter for field direction */
	void setDirection(String direction);
}
