package com.thinkgem.jeesite.modules.rs.entity;

import java.sql.Date;

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
@Table(name = "rs_enter_solidstandard", catalog = "jeesite")
public class EnterSolidInfo extends IdEntity<EnterSolidInfo> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -102815511280405573L;
	private SolidStandardItem solidStandardItem;
	private EnterBasicInfo enterBasicInfo;
	private Double value;
	private Date date;

	// Constructors

	/** default constructor */
	public EnterSolidInfo() {
	}

	/** minimal constructor */
	public EnterSolidInfo(SolidStandardItem solidStandardItem,
			EnterBasicInfo enterBasicInfo) {
		this.solidStandardItem = solidStandardItem;
		this.enterBasicInfo = enterBasicInfo;
	}

	/** full constructor */
	public EnterSolidInfo(
			SolidStandardItem solidStandardItem,
			EnterBasicInfo enterBasicInfo, Double value) {
		this.solidStandardItem = solidStandardItem;
		this.enterBasicInfo = enterBasicInfo;
		this.value = value;
	}


	@ManyToOne
	@JoinColumn(name = "SolidStandardItem", nullable = false)
	public SolidStandardItem getSolidStandardItem() {
		return this.solidStandardItem;
	}

	public void setSolidStandardItem(
			SolidStandardItem solidStandardItem) {
		this.solidStandardItem = solidStandardItem;
	}

	@ManyToOne
	@JoinColumn(name = "EnterCode", nullable = false)
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
	
	@Column
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	

}