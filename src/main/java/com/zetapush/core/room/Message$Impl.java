package com.zetapush.core.room;

import java.util.List;
import java.util.Map;


public class Message$Impl implements Message {
	private String id;
	private String author;
	private String type;
	private Map<String, Object> value;
	private Number createdAt;
	private Map<String, Object> metadata;
	private List<String> readers;
	private List<String> targets;

	/** Default constructor */
	public Message$Impl() {
	}
	/**
	 * All args constructor
	 *
	 * @param id
	 *        Message uniq id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomMessageId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 52
<li><b>max</b> (maximum value): 52
</ul>
</ul>
	 * @param author
	 *        Message author
	 * @param type
	 *        Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	 * @param value
	 *        Message value
	 * @param createdAt
	 *        Message created date
	 * @param metadata
	 *        Message metadata
	 * @param readers
	 *        Message readers
	 * @param targets
	 *        Message targets
	 */
	public Message$Impl(String id, String author, String type, Map<String, Object> value, Number createdAt, Map<String, Object> metadata, List<String> readers, List<String> targets) {
		this.id = id;
		this.author = author;
		this.type = type;
		this.value = value;
		this.createdAt = createdAt;
		this.metadata = metadata;
		this.readers = readers;
		this.targets = targets;
	}

	public String getId() {
		return id;
	}

	/** Field id
	 * Message uniq id<br>Validation constraints : <ul>
<li>Constraint <b>@ValidRoomMessageId</b> : <br>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Size</b> : <br>size of a string<br><ul>
<li><b>min</b> (minimum value): 52
<li><b>max</b> (maximum value): 52
</ul>
</ul>
	*/
	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	/** Field author
	 * Message author
	*/
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	/** Field type
	 * Message type<br>Validation constraints : <ul>
<li>Constraint <b>@ValidMessageType</b> : <br>Validate message type
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [attachment, event, markup, widget, action, data]
</ul>
</ul>
	*/
	public void setType(String type) {
		this.type = type;
	}

	public Map<String, Object> getValue() {
		return value;
	}

	/** Field value
	 * Message value
	*/
	public void setValue(Map<String, Object> value) {
		this.value = value;
	}

	public Number getCreatedAt() {
		return createdAt;
	}

	/** Field createdAt
	 * Message created date
	*/
	public void setCreatedAt(Number createdAt) {
		this.createdAt = createdAt;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	/** Field metadata
	 * Message metadata
	*/
	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public List<String> getReaders() {
		return readers;
	}

	/** Field readers
	 * Message readers
	*/
	public void setReaders(List<String> readers) {
		this.readers = readers;
	}

	public List<String> getTargets() {
		return targets;
	}

	/** Field targets
	 * Message targets
	*/
	public void setTargets(List<String> targets) {
		this.targets = targets;
	}

	public String toString() { 
		return "Message$Impl[id=" + id + ", author=" + author + ", type=" + type + ", value=" + value + ", createdAt=" + createdAt + ", metadata=" + metadata + ", readers=" + readers + ", targets=" + targets + "]";
	}
}
