package com.thinkgem.jeesite.modules.rs.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EnterairqualityinfoId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class EnterAirInfoId implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 4323615207781073585L;
	private String enterCode;
	private Integer airStandardItem;
	private Date date;

	// Constructors

	/** default constructor */
	public EnterAirInfoId() {
	}

	/** full constructor */
	public EnterAirInfoId(String enterCode,
			Integer airStandardItem, Date date) {
		this.enterCode = enterCode;
		this.airStandardItem = airStandardItem;
		this.date = date;
	}

	// Property accessors

	@Column(name = "EnterCode", nullable = false, length = 20)
	public String getEnterCode() {
		return this.enterCode;
	}

	public void setEnterCode(String enterCode) {
		this.enterCode = enterCode;
	}

	@Column(name = "AirStandardItem", nullable = false)
	public Integer getAirStandardItem() {
		return this.airStandardItem;
	}

	public void setAirStandardItem(Integer airStandardItem) {
		this.airStandardItem = airStandardItem;
	}

	@Column(name = "Date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EnterAirInfoId))
			return false;
		EnterAirInfoId castOther = (EnterAirInfoId) other;

		return ((this.getEnterCode() == castOther.getEnterCode()) || (this
				.getEnterCode() != null && castOther.getEnterCode() != null && this
				.getEnterCode().equals(castOther.getEnterCode())))
				&& ((this.getAirStandardItem() == castOther
						.getAirStandardItem()) || (this
						.getAirStandardItem() != null
						&& castOther.getAirStandardItem() != null && this
						.getAirStandardItem().equals(
								castOther.getAirStandardItem())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null
						&& castOther.getDate() != null && this.getDate()
						.equals(castOther.getDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEnterCode() == null ? 0 : this.getEnterCode().hashCode());
		result = 37
				* result
				+ (getAirStandardItem() == null ? 0 : this
						.getAirStandardItem().hashCode());
		result = 37 * result
				+ (getDate() == null ? 0 : this.getDate().hashCode());
		return result;
	}

}