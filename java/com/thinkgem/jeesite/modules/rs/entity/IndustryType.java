package com.thinkgem.jeesite.modules.rs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.thinkgem.jeesite.common.persistence.BaseEntity;

/**
 * Industrytype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_industry", catalog = "jeesite")
public class IndustryType extends BaseEntity<IndustryType>{

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7478904823645963961L;
	private String industryCode;
	/**
	 * 行业分级
	 */
	private String parentCode;
	private String industryName;
	private String industryNote;
	private Set<EnterBasicInfo> enterBasicInfos = new HashSet<EnterBasicInfo>(0);
	private Set<IndustryAirStandard> industryAirStandards = new HashSet<IndustryAirStandard>(
			0);

	// Constructors

	/** default constructor */
	public IndustryType() {
	}

	/** full constructor */
	public IndustryType(String industryName, String industryNote,
			Set<EnterBasicInfo> enterbasicinfos,
			Set<IndustryAirStandard> industryairqualitystandards) {
		this.industryName = industryName;
		this.industryNote = industryNote;
		this.enterBasicInfos = enterbasicinfos;
		this.industryAirStandards = industryairqualitystandards;
	}

	// Property accessors
	@Id
	@Column(name = "IndustryCode", unique = true, nullable = false, length = 5)
	public String getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	
	@Column(name = "parentCode", nullable = false, length = 5)
	public String getParentCode(){
		return this.parentCode;
	}
	
	public void setParentCode(String parentCode){
		this.parentCode = parentCode;
	}

	@Column(name = "IndustryName", length = 30)
	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	@Column(name = "IndustryNote", length = 200)
	public String getIndustryNote() {
		return this.industryNote;
	}

	public void setIndustryNote(String industryNote) {
		this.industryNote = industryNote;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "industryType")
	public Set<EnterBasicInfo> getEnterBasicInfos() {
		return this.enterBasicInfos;
	}

	public void setEnterBasicInfos(Set<EnterBasicInfo> enterbasicinfos) {
		this.enterBasicInfos = enterbasicinfos;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "industryType")
	public Set<IndustryAirStandard> getIndustryAirStandards() {
		return this.industryAirStandards;
	}

	public void setIndustryAirStandards(
			Set<IndustryAirStandard> industryairqualitystandards) {
		this.industryAirStandards = industryairqualitystandards;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.industryCode + " " + (industryName == null ? " ":industryName);
	}

}