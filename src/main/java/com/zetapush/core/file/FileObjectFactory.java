package com.zetapush.core.file;

import java.util.List;
import java.util.Map;
/** Factory for object instantiation */
public class FileObjectFactory {
	/** factory for new FileEntryList instances */
	public static FileEntryList createFileEntryList () {
		return new FileEntryList$Impl();
	}
	/**
	 * factory method with all parameters for FileEntryList
	 *
	 * @param exists
	 *        
	 * @param folder
	 *        
	 * @param entries
	 *        
	 * @param owner
	 *        
	 */
	public static FileEntryList createFileEntryList(Boolean exists, String folder, List<FileEntryInfo> entries, String owner) {
		return new FileEntryList$Impl(exists, folder, entries, owner);
	}
	/** factory for new FileEntry instances */
	public static FileEntry createFileEntry () {
		return new FileEntry$Impl();
	}
	/**
	 * factory method with all parameters for FileEntry
	 *
	 * @param exists
	 *        
	 * @param entry
	 *        
	 */
	public static FileEntry createFileEntry(Boolean exists, FileEntryInfo entry) {
		return new FileEntry$Impl(exists, entry);
	}
	/** factory for new confirmFileUploadInput instances */
	public static confirmFileUploadInput createconfirmFileUploadInput () {
		return new confirmFileUploadInput$Impl();
	}
	/**
	 * factory method with all parameters for confirmFileUploadInput
	 *
	 * @param guid
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 * @param actions
	 *        
	 * @param metadata
	 *        
	 * @param tags
	 *        
	 */
	public static confirmFileUploadInput createconfirmFileUploadInput(String guid, String owner, Map<String, Object> actions, Map<String, Object> metadata, List tags) {
		return new confirmFileUploadInput$Impl(guid, owner, actions, metadata, tags);
	}
	/** factory for new FileEntryInfo instances */
	public static FileEntryInfo createFileEntryInfo () {
		return new FileEntryInfo$Impl();
	}
	/**
	 * factory method with all parameters for FileEntryInfo
	 *
	 * @param name
	 *        
	 * @param type
	 *        
	 * @param file
	 *        
	 * @param creation
	 *        
	 * @param metadata
	 *        
	 * @param tags
	 *        
	 * @param owner
	 *        
	 */
	public static FileEntryInfo createFileEntryInfo(String name, String type, FileUrl file, Number creation, Map<String, Object> metadata, List<String> tags, String owner) {
		return new FileEntryInfo$Impl(name, type, file, creation, metadata, tags, owner);
	}
	/** factory for new requestFileUploadInput instances */
	public static requestFileUploadInput createrequestFileUploadInput () {
		return new requestFileUploadInput$Impl();
	}
	/**
	 * factory method with all parameters for requestFileUploadInput
	 *
	 * @param contentType
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param folder
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 */
	public static requestFileUploadInput createrequestFileUploadInput(String contentType, String folder, String owner) {
		return new requestFileUploadInput$Impl(contentType, folder, owner);
	}
	/** factory for new FileUploadRequest instances */
	public static FileUploadRequest createFileUploadRequest () {
		return new FileUploadRequest$Impl();
	}
	/**
	 * factory method with all parameters for FileUploadRequest
	 *
	 * @param contentType
	 *        
	 * @param httpMethod
	 *        
	 * @param guid
	 *        
	 * @param url
	 *        
	 * @param owner
	 *        
	 */
	public static FileUploadRequest createFileUploadRequest(String contentType, String httpMethod, String guid, String url, String owner) {
		return new FileUploadRequest$Impl(contentType, httpMethod, guid, url, owner);
	}
	/** factory for new deleteFileEntryInput instances */
	public static deleteFileEntryInput createdeleteFileEntryInput () {
		return new deleteFileEntryInput$Impl();
	}
	/**
	 * factory method with all parameters for deleteFileEntryInput
	 *
	 * @param path
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 */
	public static deleteFileEntryInput createdeleteFileEntryInput(String path, String owner) {
		return new deleteFileEntryInput$Impl(path, owner);
	}
	/** factory for new getFileEntryListInput instances */
	public static getFileEntryListInput creategetFileEntryListInput () {
		return new getFileEntryListInput$Impl();
	}
	/**
	 * factory method with all parameters for getFileEntryListInput
	 *
	 * @param folder
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 */
	public static getFileEntryListInput creategetFileEntryListInput(String folder, String owner) {
		return new getFileEntryListInput$Impl(folder, owner);
	}
	/** factory for new FileUrl instances */
	public static FileUrl createFileUrl () {
		return new FileUrl$Impl();
	}
	/**
	 * factory method with all parameters for FileUrl
	 *
	 * @param contentType
	 *        File mime type
	 * @param meta
	 *        Metadata, as originally uploaded
	 * @param guid
	 *        File GUID
	 * @param path
	 *        File path
	 * @param hash
	 *        File hash
	 * @param size
	 *        File size
	 * @param url
	 *        HTTP url
	 */
	public static FileUrl createFileUrl(String contentType, Map<String, Object> meta, String guid, String path, String hash, Number size, String url) {
		return new FileUrl$Impl(contentType, meta, guid, path, hash, size, url);
	}
	/** factory for new getFileEntryInput instances */
	public static getFileEntryInput creategetFileEntryInput () {
		return new getFileEntryInput$Impl();
	}
	/**
	 * factory method with all parameters for getFileEntryInput
	 *
	 * @param path
	 *        <br>Validation constraints : <ul>
<li>Constraint <b>@NotNull</b> : <br>a NotNull parameter will cause an error when absent
</ul>
	 * @param owner
	 *        
	 */
	public static getFileEntryInput creategetFileEntryInput(String path, String owner) {
		return new getFileEntryInput$Impl(path, owner);
	}
}
