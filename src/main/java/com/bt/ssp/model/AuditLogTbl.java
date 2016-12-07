package com.bt.ssp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AUDIT_LOG_TBL")
public class AuditLogTbl {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AUDIT_ID", length = 10)
	private int auditId;

	@Column(name = "USER_ID",length=15)
	private String userRoles;

	@Column(name = "TIME")
	@Temporal(TemporalType.DATE)
	private Date time;

	@Column(name = "LOGS", length = 500)
	private String logs;

	@ManyToOne
	@JoinColumn(name = "HOST_NAME", nullable = false, referencedColumnName = "HOST_NAME")
	private Device hostName;
	
	@Column(name="ROLE_ID",length=11)
	private int roleId;

	public int getAuditId() {
		return auditId;
	}

	public void setAuditId(int auditId) {
		this.auditId = auditId;
	}

	public String getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(String userRoles) {
		this.userRoles = userRoles;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getLogs() {
		return logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}

	public Device getHostName() {
		return hostName;
	}

	public void setHostName(Device hostName) {
		this.hostName = hostName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	

}
