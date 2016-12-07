package com.bt.ssp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PLUGIN_KPI")
public class PluginKpi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PKR_ID")
	private int pkrId;
	
	@Column(name="KPI_ID")
//	@ManyToOne@JoinColumn(name="KPI_ID")
	private int kpiId;
	
//	@Column(name="P_ID")
//	@ManyToOne@JoinColumn(name="P_ID")
//	private int pId;

	@Column(name="METRIC_NAME",length=50)
	private String metricName;
	
	@Column(name="PART_TYPE",length=50)
	private String partType;

	@Column(name="MODULE",length=50)
	private String module;
	
	@Column(name="PLUGIN_NAME")
	private String pluginName;
	
	@Column(name="PLUGIN_VERSION")
	private int pluginVersion;
	
//	@Column(name="WAIT",length=2)
//	private int wait;
	
	@Column(name="CRITICAL")
	private double critical;
	
	@Column(name="MAJOR")
	private double major;
	
	@Column(name="MINOR")
	private double minor;
	
	
	@Column(name="PART",length=50)
	private String part;

	public int getPkrId() {
		return pkrId;
	}

	public void setPkrId(int pkrId) {
		this.pkrId = pkrId;
	}

	public int getKpiId() {
		return kpiId;
	}

	public void setKpiId(int kpiId) {
		this.kpiId = kpiId;
	}

	/*public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}*/

	public String getMetricName() {
		return metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getPluginName() {
		return pluginName;
	}

	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	public int getPluginVersion() {
		return pluginVersion;
	}

	public void setPluginVersion(int pluginVersion) {
		this.pluginVersion = pluginVersion;
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

	/*public int getWait() {
		return wait;
	}

	public void setWait(int wait) {
		this.wait = wait;
	}*/

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}
	
	
	
}
