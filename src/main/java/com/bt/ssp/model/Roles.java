package com.bt.ssp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class Roles {

	@Id
	@Column(name="ROLE_ID",length=10)
	private int roleId;
	
	@Column(name="NAME",length=50)
	private String name;
	
	@Column(name="DESCRIPTION",length=500)
	private String description;
	
	@Column(name="FILTER",length=500)
	private String filter;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}
	
	
}
