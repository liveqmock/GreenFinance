package com.thinkgem.jeesite.modules.rs.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Enterairqualityinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_enter_airstandard", catalog = "jeesite")
public class EnterAirInfo implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 2830721754825711565L;
	private EnterAirInfoId id;
	private AirStandardItem airStandardItem;
	private EnterBasicInfo enterBasicInfo;
	private Double value;

	// Constructors

	/** default constructor */
	public EnterAirInfo() {
	}

	/** minimal constructor */
	public EnterAirInfo(EnterAirInfoId id,
			AirStandardItem airStandardItem,
			EnterBasicInfo enterBasicInfo) {
		this.id = id;
		this.airStandardItem = airStandardItem;
		this.enterBasicInfo = enterBasicInfo;
	}

	/** full constructor */
	public EnterAirInfo(EnterAirInfoId id,
			AirStandardItem airStandardItem,
			EnterBasicInfo enterBasicInfo, Double value) {
		this.id = id;
		this.airStandardItem = airStandardItem;
		this.enterBasicInfo = enterBasicInfo;
		this.value = value;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "enterCode", column = @Column(name = "EnterCode", nullable = false, length = 20)),
			@AttributeOverride(name = "airStandardItem", column = @Column(name = "AirStandardItem", nullable = false)),
			@AttributeOverride(name = "date", column = @Column(name = "Date", nullable = false, length = 19)) })
	public EnterAirInfoId getId() {
		return this.id;
	}

	public void setId(EnterAirInfoId id) {
		this.id = id;
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