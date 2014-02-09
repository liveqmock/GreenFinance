package com.thinkgem.jeesite.modules.rs.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IndustryairqualitystandardId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class IndustryAirStandardId implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -1299281251880915149L;
	private String industryType;
	private Integer airStandardItem;

	// Constructors

	/** default constructor */
	public IndustryAirStandardId() {
	}

	/** full constructor */
	public IndustryAirStandardId(String industryType,
			Integer airQualityStandardItem) {
		this.industryType = industryType;
		this.airStandardItem = airQualityStandardItem;
	}

	// Property accessors

	@Column(name = "IndustryType", nullable = false, length = 5)
	public String getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	@Column(name = "AirStandardItem", nullable = false)
	public Integer getAirStandardItem() {
		return this.airStandardItem;
	}

	public void setAirStandardItem(Integer airStandardItem) {
		this.airStandardItem = airStandardItem;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IndustryAirStandardId))
			return false;
		IndustryAirStandardId castOther = (IndustryAirStandardId) other;

		return ((this.getIndustryType() == castOther.getIndustryType()) || (this
				.getIndustryType() != null
				&& castOther.getIndustryType() != null && this
				.getIndustryType().equals(castOther.getIndustryType())))
				&& ((this.getAirStandardItem() == castOther
						.getAirStandardItem()) || (this
						.getAirStandardItem() != null
						&& castOther.getAirStandardItem() != null && this
						.getAirStandardItem().equals(
								castOther.getAirStandardItem())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIndustryType() == null ? 0 : this.getIndustryType()
						.hashCode());
		result = 37
				* result
				+ (getAirStandardItem() == null ? 0 : this
						.getAirStandardItem().hashCode());
		return result;
	}

}