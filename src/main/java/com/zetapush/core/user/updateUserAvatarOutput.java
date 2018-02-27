package com.zetapush.core.user;

import com.zetapush.common.messages.filestorage.ListingEntryInfo;

/** Result of the call to macro 'updateUserAvatar' */
public class updateUserAvatarOutput {
	private ListingEntryInfo avatar;

	/** Default constructor */
	public updateUserAvatarOutput() {
	}
	/**
	 * All args constructor
	 *
	 * @param avatar
	 *        
	 */
	public updateUserAvatarOutput(ListingEntryInfo avatar) {
		this.avatar = avatar;
	}

	public ListingEntryInfo getAvatar() {
		return avatar;
	}

	/** Field avatar
	 * 
	*/
	public void setAvatar(ListingEntryInfo avatar) {
		this.avatar = avatar;
	}

	public String toString() { 
		return "updateUserAvatarOutput[avatar=" + avatar + "]";
	}
}
