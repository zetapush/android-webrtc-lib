package com.zetapush.core.utils;

import java.util.List;
import java.util.Map;
/** Factory for object instantiation */
public class UtilsObjectFactory {
	/** factory for new Metadata instances */
	public static Metadata createMetadata () {
		return new Metadata$Impl();
	}
	/**
	 * factory method with all parameters for Metadata
	 *
	 * @param id
	 *        Id
	 * @param revision
	 *        Revision
	 * @param update
	 *        Update
	 * @param value
	 *        Value
	 */
	public static Metadata createMetadata(String id, Number revision, Number update, Map<String, Object> value) {
		return new Metadata$Impl(id, revision, update, value);
	}
	/** factory for new Tags instances */
	public static Tags createTags () {
		return new Tags$Impl();
	}
	/**
	 * factory method with all parameters for Tags
	 *
	 * @param id
	 *        Id
	 * @param revision
	 *        Revision
	 * @param update
	 *        Update
	 * @param value
	 *        Value
	 */
	public static Tags createTags(String id, Number revision, Number update, List<String> value) {
		return new Tags$Impl(id, revision, update, value);
	}
	/** factory for new removeTagsInput instances */
	public static removeTagsInput createremoveTagsInput () {
		return new removeTagsInput$Impl();
	}
	/**
	 * factory method with all parameters for removeTagsInput
	 *
	 * @param id
	 *        Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static removeTagsInput createremoveTagsInput(String id) {
		return new removeTagsInput$Impl(id);
	}
	/** factory for new Targets instances */
	public static Targets createTargets () {
		return new Targets$Impl();
	}
	/**
	 * factory method with all parameters for Targets
	 *
	 * @param id
	 *        Id
	 * @param revision
	 *        Revision
	 * @param update
	 *        Update
	 * @param value
	 *        Value
	 */
	public static Targets createTargets(String id, Number revision, Number update, List<String> value) {
		return new Targets$Impl(id, revision, update, value);
	}
	/** factory for new Storable instances */
	public static Storable createStorable () {
		return new Storable$Impl();
	}
	/**
	 * factory method with all parameters for Storable
	 *
	 * @param id
	 *        Id
	 * @param revision
	 *        Revision
	 * @param update
	 *        Update
	 */
	public static Storable createStorable(String id, Number revision, Number update) {
		return new Storable$Impl(id, revision, update);
	}
	/** factory for new getMetadataInput instances */
	public static getMetadataInput creategetMetadataInput () {
		return new getMetadataInput$Impl();
	}
	/**
	 * factory method with all parameters for getMetadataInput
	 *
	 * @param id
	 *        Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static getMetadataInput creategetMetadataInput(String id) {
		return new getMetadataInput$Impl(id);
	}
	/** factory for new getTargetsInput instances */
	public static getTargetsInput creategetTargetsInput () {
		return new getTargetsInput$Impl();
	}
	/**
	 * factory method with all parameters for getTargetsInput
	 *
	 * @param id
	 *        Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static getTargetsInput creategetTargetsInput(String id) {
		return new getTargetsInput$Impl(id);
	}
	/** factory for new setTargetsInput instances */
	public static setTargetsInput createsetTargetsInput () {
		return new setTargetsInput$Impl();
	}
	/**
	 * factory method with all parameters for setTargetsInput
	 *
	 * @param id
	 *        Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param targets
	 *        Targets value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static setTargetsInput createsetTargetsInput(String id, String targets) {
		return new setTargetsInput$Impl(id, targets);
	}
	/** factory for new Pagination instances */
	public static Pagination createPagination () {
		return new Pagination$Impl();
	}
	/**
	 * factory method with all parameters for Pagination
	 *
	 * @param pageSize
	 *        page size<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 1
</ul>
<li>Constraint <b>@Max</b> : <br>maximum value for an integer<br><ul>
<li><b>max</b> (maximum value): 200
</ul>
</ul>
	 * @param pageNumber
	 *        page number<br>Validation constraints : <ul>
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 0
</ul>
</ul>
	 * @param direction
	 *        page direction
	 */
	public static Pagination createPagination(Number pageSize, Number pageNumber, String direction) {
		return new Pagination$Impl(pageSize, pageNumber, direction);
	}
	/** factory for new setTagsInput instances */
	public static setTagsInput createsetTagsInput () {
		return new setTagsInput$Impl();
	}
	/**
	 * factory method with all parameters for setTagsInput
	 *
	 * @param id
	 *        Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param tags
	 *        tags value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static setTagsInput createsetTagsInput(String id, String tags) {
		return new setTagsInput$Impl(id, tags);
	}
	/** factory for new ResponsePagination instances */
	public static ResponsePagination createResponsePagination () {
		return new ResponsePagination$Impl();
	}
	/**
	 * factory method with all parameters for ResponsePagination
	 *
	 * @param pageSize
	 *        The number of elements by page (minimum 1)<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 1
</ul>
</ul>
	 * @param pageNumber
	 *        The page number (zero-based)<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
<li>Constraint <b>@Min</b> : <br>minimum value for an integer<br><ul>
<li><b>min</b> (minimum value): 0
</ul>
</ul>
	 * @param direction
	 *        Optional sort direction ('ASC'/'DESC'). Default is ASC when not specified.<br>Validation constraints : <ul>
<li>Constraint <b>@Enum</b> : <br>value must be part of the list<br><ul>
<li><b>list</b> (the list of authorized values): [ASC, DESC]
</ul>
</ul>
	 * @param hasNext
	 *        true to indicate if there is one more page available, false otherwise
	 */
	public static ResponsePagination createResponsePagination(Number pageSize, Number pageNumber, String direction, Boolean hasNext) {
		return new ResponsePagination$Impl(pageSize, pageNumber, direction, hasNext);
	}
	/** factory for new getTagsInput instances */
	public static getTagsInput creategetTagsInput () {
		return new getTagsInput$Impl();
	}
	/**
	 * factory method with all parameters for getTagsInput
	 *
	 * @param id
	 *        Tags id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static getTagsInput creategetTagsInput(String id) {
		return new getTagsInput$Impl(id);
	}
	/** factory for new removeMetadataInput instances */
	public static removeMetadataInput createremoveMetadataInput () {
		return new removeMetadataInput$Impl();
	}
	/**
	 * factory method with all parameters for removeMetadataInput
	 *
	 * @param id
	 *        Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static removeMetadataInput createremoveMetadataInput(String id) {
		return new removeMetadataInput$Impl(id);
	}
	/** factory for new removeTargetsInput instances */
	public static removeTargetsInput createremoveTargetsInput () {
		return new removeTargetsInput$Impl();
	}
	/**
	 * factory method with all parameters for removeTargetsInput
	 *
	 * @param id
	 *        Targets id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static removeTargetsInput createremoveTargetsInput(String id) {
		return new removeTargetsInput$Impl(id);
	}
	/** factory for new setMetadataInput instances */
	public static setMetadataInput createsetMetadataInput () {
		return new setMetadataInput$Impl();
	}
	/**
	 * factory method with all parameters for setMetadataInput
	 *
	 * @param id
	 *        Metadata id<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param metadata
	 *        Metadata value<br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 */
	public static setMetadataInput createsetMetadataInput(String id, Map<String, Object> metadata) {
		return new setMetadataInput$Impl(id, metadata);
	}
}
