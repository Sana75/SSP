package com.bt.ssp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id@Column(name="CUSTOMER_ID",length=15)
	private int customerId;
	
	@Column(name="CUSTOMER_NAME",length=225)
	private String customerName;
	
	@Column(name="DEVICE",length=100)
	private String device;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
		
	
}
