package com.zetapush.core.utils;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.utils.Storable$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.utils.Metadata$Impl.class, name = "com.zetapush.core.utils.Metadata"),
	@Type(value = com.zetapush.core.utils.Tags$Impl.class, name = "com.zetapush.core.utils.Tags"),
	@Type(value = com.zetapush.core.utils.Targets$Impl.class, name = "com.zetapush.core.utils.Targets"),
	@Type(value = com.zetapush.core.utils.Storable$Impl.class, name = "com.zetapush.core.utils.Storable") })
public interface Storable {

	/** Getter for field id
	 * Id
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field revision
	 * Revision
	 */
	Number getRevision();

	/** Setter for field revision */
	void setRevision(Number revision);

	/** Getter for field update
	 * Update
	 */
	Number getUpdate();

	/** Setter for field update */
	void setUpdate(Number update);
}
