package com.practice;

import java.sql.Date;

public class Profile {

	private long profileId;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date profileCreatedDate;
	
	public Profile() {
		// TODO Auto-generated constructor stub
		
	}

	public Profile(long profileId, String profileName, String firstName, String lastName, Date profileCreatedDate) {
		this.profileId = profileId;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileCreatedDate = profileCreatedDate;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getProfileId() {
		return profileId;
	}
	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public Date getProfileCreatedDate() {
		return profileCreatedDate;
	}
	public void setProfileCreatedDate(Date profileCreatedDate) {
		this.profileCreatedDate = profileCreatedDate;
	} 
}
