package com.bt.ssp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DEVICE")
public class Device {
	
	@Id
	@Column(name="HOST_NAME",length=50,nullable = false, unique = true)
	private String hostName;
	
	@ManyToOne@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;
	
	//@OneToOne@JoinColumn(name="SITE_ID")
	//private Site siteId;
	
	@Column(name="DEVICE_TYPE",length=15)
	private String deviceType;
	
	@Column(name="CMK_ID",length=50)
	private String cmkId;
	
	@Column(name="OS_NAME",length=80)
	private String osName;
	
	@Column(name="OS_TYPE",length=40)
	private String osType;
	
	@Column(name="VERSION",length=5)
	private String version;
	
	@Column(name="IP",length=15,nullable = false, unique = true)
	private String ip;



	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/*public Site getSiteId() {
		return siteId;
	}

	public void setSiteId(Site siteId) {
		this.siteId = siteId;
	}*/

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getCmkId() {
		return cmkId;
	}

	public void setCmkId(String cmkId) {
		this.cmkId = cmkId;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
}
