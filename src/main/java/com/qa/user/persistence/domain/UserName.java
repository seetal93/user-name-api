package com.qa.user.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserName {
	@Id
	private String userName;
	
	public UserName() {}
	
	public UserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
}
