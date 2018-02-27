package com.zetapush.core.room;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import java.util.List;
import java.util.Map;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "__class", defaultImpl = com.zetapush.core.room.Message$Impl.class)
@JsonSubTypes({
	@Type(value = com.zetapush.core.room.Message$Impl.class, name = "com.zetapush.core.room.Message") })
public interface Message {

	/** Getter for field id
	 * Message uniq id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomMessageId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 52
<li><b>max</b> (maximum value): 52
</ul>
</ul>
	 */
	String getId();

	/** Setter for field id */
	void setId(String id);

	/** Getter for field author
	 * Message author
	 */
	String getAuthor();

	/** Setter for field author */
	void setAuthor(String author);

	/** Getter for field type
	 * Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	 */
	String getType();

	/** Setter for field type */
	void setType(String type);

	/** Getter for field value
	 * Message value
	 */
	Map<String, Object> getValue();

	/** Setter for field value */
	void setValue(Map<String, Object> value);

	/** Getter for field createdAt
	 * Message created date
	 */
	Number getCreatedAt();

	/** Setter for field createdAt */
	void setCreatedAt(Number createdAt);

	/** Getter for field metadata
	 * Message metadata
	 */
	Map<String, Object> getMetadata();

	/** Setter for field metadata */
	void setMetadata(Map<String, Object> metadata);

	/** Getter for field readers
	 * Message readers
	 */
	List<String> getReaders();

	/** Setter for field readers */
	void setReaders(List<String> readers);

	/** Getter for field targets
	 * Message targets
	 */
	List<String> getTargets();

	/** Setter for field targets */
	void setTargets(List<String> targets);
}
