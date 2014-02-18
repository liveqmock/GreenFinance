package com.green.modules.rs.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Industryairqualitystandard entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_industry_airstandard", catalog = "jeesite")
public class IndustryAirStandard implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3478610051833771593L;
	private IndustryAirStandardId id;
	private IndustryType industryType;
	private StandardValue aLevel;
	private StandardValue bLevel;
	private AirStandardItem airStandardItem;

	// Constructors

	/** default constructor */
	public IndustryAirStandard() {
	}

	/** minimal constructor */
	public IndustryAirStandard(IndustryAirStandardId id,
			IndustryType industrytype,
			AirStandardItem airqualitystandarditem) {
		this.id = id;
		this.industryType = industrytype;
		this.airStandardItem = airqualitystandarditem;
	}

	/** full constructor */
	public IndustryAirStandard(IndustryAirStandardId id,
			IndustryType industrytype, StandardValue bLevel,
			StandardValue aLevel,
			AirStandardItem airStandarditem) {
		this.id = id;
		this.industryType = industrytype;
		this.bLevel = bLevel;
		this.aLevel = aLevel;
		this.airStandardItem = airStandarditem;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "industryType", column = @Column(name = "IndustryType", nullable = false, length = 5)),
			@AttributeOverride(name = "airStandardItem", column = @Column(name = "AirStandardItem", nullable = false)) })
	public IndustryAirStandardId getId() {
		return this.id;
	}

	public void setId(IndustryAirStandardId id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "IndustryType", nullable = false, insertable = false, updatable = false) 
	public IndustryType getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(IndustryType industrytype) {
		this.industryType = industrytype;
	}

	@ManyToOne
	@JoinColumn(name = "BLevel")
	public StandardValue getBLevel() {
		return this.bLevel;
	}

	public void setBLevel(StandardValue bLevel) {
		this.bLevel = bLevel;
	}

	@ManyToOne
	@JoinColumn(name = "ALevel")
	public StandardValue getALevel() {
		return this.aLevel;
	}

	public void setALevel(StandardValue aLevel) {
		this.aLevel = aLevel;
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

}