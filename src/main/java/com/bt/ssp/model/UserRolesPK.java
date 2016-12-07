package com.bt.ssp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class UserRolesPK implements Serializable {

	
	@Column(name="USER_ID",length=50)
	private String userId;
	
	@OneToOne
	@JoinColumn(name="ROLE_ID")
	private Roles roleId;
	
	public UserRolesPK(){
		
	}

	public UserRolesPK(String userId, Roles roleId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Roles getRoleId() {
		return roleId;
	}

	public void setRoleId(Roles roleId) {
		this.roleId = roleId;
	}

	
	
}
