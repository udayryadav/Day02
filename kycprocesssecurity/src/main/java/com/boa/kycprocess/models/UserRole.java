package com.boa.kycprocess.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User_Roles")
public class UserRole {

	@Id
	@Column(name = "ROLE")
	private String role;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "USERNAME")
	private User user;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
