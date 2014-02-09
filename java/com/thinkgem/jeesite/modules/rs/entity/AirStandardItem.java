package com.thinkgem.jeesite.modules.rs.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Airqualitystandarditem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_airstandard", catalog = "jeesite")
public class AirStandardItem implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -3832843595566947919L;
	private Integer id;
	private String itemName;
	private String avarageTime;
	private String itemUnit;
	private Set<IndustryAirStandard> industryAirStandards = new HashSet<IndustryAirStandard>(
			0);
	private Set<EnterAirInfo> enterAirInfos = new HashSet<EnterAirInfo>(
			0);

	// Constructors

	/** default constructor */
	public AirStandardItem() {
	}

	/** minimal constructor */
	public AirStandardItem(String itemName, String avarageTime,
			String itemUnit) {
		this.itemName = itemName;
		this.avarageTime = avarageTime;
		this.itemUnit = itemUnit;
	}

	/** full constructor */
	public AirStandardItem(String itemName, String avarageTime,
			String itemUnit,
			Set<IndustryAirStandard> industryAirStandards,
			Set<EnterAirInfo> enterAirInfos) {
		this.itemName = itemName;
		this.avarageTime = avarageTime;
		this.itemUnit = itemUnit;
		this.industryAirStandards = industryAirStandards;
		this.enterAirInfos = enterAirInfos;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ItemName", nullable = false, length = 30)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Column(name = "AvarageTime", nullable = false, length = 8)
	public String getAvarageTime() {
		return this.avarageTime;
	}

	public void setAvarageTime(String avarageTime) {
		this.avarageTime = avarageTime;
	}

	@Column(name = "ItemUnit", nullable = false, length = 15)
	public String getItemUnit() {
		return this.itemUnit;
	}

	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "airStandardItem")
	public Set<IndustryAirStandard> getIndustryAirStandards() {
		return this.industryAirStandards;
	}

	public void setIndustryAirStandards(
			Set<IndustryAirStandard> industryAirStandards) {
		this.industryAirStandards = industryAirStandards;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "airStandardItem")
	public Set<EnterAirInfo> getEnterAirInfos() {
		return this.enterAirInfos;
	}

	public void setEnterAirInfos(
			Set<EnterAirInfo> enterAirInfos) {
		this.enterAirInfos = enterAirInfos;
	}

}