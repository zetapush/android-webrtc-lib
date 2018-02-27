package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.zetapush.core.utils.Pagination;

/**
 *
 */@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.getRoomInput$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.getRoomInput$Impl.class, name = "com.zetapush.core.room.getRoomInput") })
public interface getRoomInput {

	/** Getter for field id
	 * Room room id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 32
<li><b>max</b> (maximum value): 32
</ul>
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field owner
	 * Room room owner<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	String getOwner();

	/** Setter for field owner */
	void setOwner(String owner);

	/** Getter for field page
	 * Room pagination
	 */
	Pagination getPage();

	/** Setter for field page */
	void setPage(Pagination page);
}
