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
@Table(name="DEVICE_THRESHOLD")
public class DeviceThreshold {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="T_ID")
	private int tId;
	
	@ManyToOne
	@JoinColumn(name="HOST_NAME")
	private Device device; 
	
	@OneToOne
	@JoinColumn(name="PKR_ID")
	private PluginKpi pluginKpiRelation;
	
	@Column(name="MAJOR")
	private double major;
	
	@Column(name="MINOR")
	private double minor;
	
	@Column(name="CRITICAL")
	private double critical;
	
	@Column(name="ALERT_ENABLED",length=5)
	private String alertEnabled;
	
	@Column(name="SMOOTHING_INTERVAL",length=1)
	private int smoothingInterval;

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public PluginKpi getPluginKpiRelation() {
		return pluginKpiRelation;
	}

	public void setPluginKpiRelation(PluginKpi pluginKpiRelation) {
		this.pluginKpiRelation = pluginKpiRelation;
	}

	public double getMajor() {
		return major;
	}

	public void setMajor(double major) {
		this.major = major;
	}

	public double getMinor() {
		return minor;
	}

	public void setMinor(double minor) {
		this.minor = minor;
	}

	public double getCritical() {
		return critical;
	}

	public void setCritical(double critical) {
		this.critical = critical;
	}

	public String getAlertEnabled() {
		return alertEnabled;
	}

	public void setAlertEnabled(String alertEnabled) {
		this.alertEnabled = alertEnabled;
	}

	public int getSmoothingInterval() {
		return smoothingInterval;
	}

	public void setSmoothingInterval(int smoothingInterval) {
		this.smoothingInterval = smoothingInterval;
	}

	
}
