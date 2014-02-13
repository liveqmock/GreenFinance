package com.thinkgem.jeesite.modules.rs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.thinkgem.jeesite.common.persistence.IdEntity;

/**
 * Enterairqualityinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_enter_airstandard", catalog = "jeesite")
public class EnterAirInfo extends IdEntity<EnterAirInfo> {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 2830721754825711565L;
	private AirStandardItem airStandardItem;
	private EnterBasicInfo enterBasicInfo;
	private Double value;

	// Constructors

	/** default constructor */
	public EnterAirInfo() {
	}

	/** minimal constructor */
	public EnterAirInfo(AirStandardItem airStandardItem,
			EnterBasicInfo enterBasicInfo) {
		this.airStandardItem = airStandardItem;
		this.enterBasicInfo = enterBasicInfo;
	}

	/** full constructor */
	public EnterAirInfo(
			AirStandardItem airStandardItem,
			EnterBasicInfo enterBasicInfo, Double value) {
		this.airStandardItem = airStandardItem;
		this.enterBasicInfo = enterBasicInfo;
		this.value = value;
	}


	@ManyToOne
	@JoinColumn(name = "AirStandardItem", nullable = false, insertable = false, updatable = false)
	public AirStandardItem getAirStandardItem() {
		return this.airStandardItem;
	}

	public void setAirStandardItem(
			AirStandardItem airStandardItem) {
		this.airStandardItem = airStandardItem;
	}

	@ManyToOne
	@JoinColumn(name = "EnterCode", nullable = false, insertable = false, updatable = false)
	public EnterBasicInfo getEnterBasicInfo() {
		return this.enterBasicInfo;
	}

	public void setEnterBasicInfo(EnterBasicInfo enterBasicInfo) {
		this.enterBasicInfo = enterBasicInfo;
	}

	@Column(name = "value", precision = 22, scale = 0)
	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}