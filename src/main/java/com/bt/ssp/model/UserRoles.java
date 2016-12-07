package com.bt.ssp.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="USER_ROLES")
public class UserRoles {
	
	@EmbeddedId
	private UserRolesPK userRolesPK;
	
	@Column(name="ACCESS_TYPE",length=10)
	private String accessType;
	
	public UserRoles(String userId,Roles roleId){
		this.userRolesPK = new UserRolesPK(userId,roleId);
	}

	public UserRoles() {
		
	}

	public UserRolesPK getUserRolesPK() {
		return userRolesPK;
	}

	public void setUserRolesPK(UserRolesPK userRolesPK) {
		this.userRolesPK = userRolesPK;
	}

	public String getAccessType() {
		return accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
	}
	
	

}
