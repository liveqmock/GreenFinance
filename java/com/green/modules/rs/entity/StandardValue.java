package com.green.modules.rs.entity;

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
 * Standardvalue entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_standardvalue", catalog = "jeesite")
public class StandardValue implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -5904548009386382684L;
	private Integer id;
	private String evaluateType;
	private Double value;
	private Set<IndustryAirStandard> aLevels = new HashSet<IndustryAirStandard>(
			0);
	private Set<IndustryAirStandard> bLevels = new HashSet<IndustryAirStandard>(
			0);

	// Constructors

	/** default constructor */
	public StandardValue() {
	}

	/** full constructor */
	public StandardValue(
			String evaluateType,
			Double value,
			Set<IndustryAirStandard> bLevels,
			Set<IndustryAirStandard> aLevels) {
		this.evaluateType = evaluateType;
		this.value = value;
		this.bLevels = bLevels;
		this.aLevels = aLevels;
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

	@Column(name = "EvaluateType", length = 5)
	public String getEvaluateType() {
		return this.evaluateType;
	}

	public void setEvaluateType(String evaluateType) {
		this.evaluateType = evaluateType;
	}

	@Column(name = "Value", precision = 22, scale = 0)
	public Double getValue() {
		return this.value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "BLevel")
	public Set<IndustryAirStandard> getBLevels() {
		return this.bLevels;
	}

	public void setBLevels(
			Set<IndustryAirStandard> bLevels) {
		this.bLevels = bLevels;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ALevel")
	public Set<IndustryAirStandard> getALevels() {
		return this.aLevels;
	}

	public void setALevels(
			Set<IndustryAirStandard> aLevels) {
		this.aLevels = aLevels;
	}

}