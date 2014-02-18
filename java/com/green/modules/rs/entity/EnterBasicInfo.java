package com.green.modules.rs.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.green.common.persistence.BaseEntity;

/**
 * Enterbasicinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_enterbasicinfo", catalog = "jeesite")
public class EnterBasicInfo extends BaseEntity<EnterBasicInfo>{

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -7949496490005740451L;
	private String enterCode;
	private IndustryType industryType;
	private String codeRegion;
	private String corpCode;
	private Timestamp createTime;
	private String enterAddress;
	private String enterName;
	private String enterType;
	private String linkMan;
	private String fax;
	private Integer longitude;
	private Integer latitude;
	private String postalCode;
	private String telephone;
	private String baseImage;
	private String logo;
	private Set<EnterAirInfo> enterAirInfos = new HashSet<EnterAirInfo>(
			0);
	private String delFlag;

	// Constructors

	/** default constructor */
	public EnterBasicInfo() {
	}

	/** full constructor */
	public EnterBasicInfo(IndustryType industryType, String codeRegion,
			String corpCode, Timestamp createTime, String enterAddress,
			String enterName, String enterType, String linkMan, String fax,
			Integer longitude, Integer latitude, String postalCode,
			String telephone, Set<EnterAirInfo> enterAirInfos) {
		this.industryType = industryType;
		this.codeRegion = codeRegion;
		this.corpCode = corpCode;
		this.createTime = createTime;
		this.enterAddress = enterAddress;
		this.enterName = enterName;
		this.enterType = enterType;
		this.linkMan = linkMan;
		this.fax = fax;
		this.longitude = longitude;
		this.latitude = latitude;
		this.postalCode = postalCode;
		this.telephone = telephone;
		this.enterAirInfos = enterAirInfos;
	}

	// Property accessors
	@Id
	@Column(name = "EnterCode", unique = true, nullable = false, length = 20)
	public String getEnterCode() {
		return this.enterCode;
	}

	public void setEnterCode(String enterCode) {
		this.enterCode = enterCode;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "IndustryType")
	public IndustryType getIndustryType() {
		return this.industryType;
	}

	public void setIndustryType(IndustryType industrytype) {
		this.industryType = industrytype;
	}

	@Column(name = "CodeRegion", length = 6)
	public String getCodeRegion() {
		return this.codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	@Column(name = "CorpCode", length = 15)
	public String getCorpCode() {
		return this.corpCode;
	}

	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	@Column(name = "CreateTime", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@Column(name = "EnterAddress", length = 30)
	public String getEnterAddress() {
		return this.enterAddress;
	}

	public void setEnterAddress(String enterAddress) {
		this.enterAddress = enterAddress;
	}

	@Column(name = "EnterName", length = 100)
	public String getEnterName() {
		return this.enterName;
	}

	public void setEnterName(String enterName) {
		this.enterName = enterName;
	}

	@Column(name = "EnterType", length = 20)
	public String getEnterType() {
		return this.enterType;
	}

	public void setEnterType(String enterType) {
		this.enterType = enterType;
	}

	@Column(name = "LinkMan", length = 50)
	public String getLinkMan() {
		return this.linkMan;
	}

	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}

	@Column(name = "Fax", length = 15)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "Longitude", precision = 9, scale = 0)
	public Integer getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Integer longitude) {
		this.longitude = longitude;
	}

	@Column(name = "Latitude", precision = 9, scale = 0)
	public Integer getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Integer latitude) {
		this.latitude = latitude;
	}

	@Column(name = "PostalCode", length = 6)
	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Column(name = "Telephone", length = 15)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column
	public String getBaseImage(){
		return this.baseImage;
	}
	
	public void setBaseImage(String baseImage){
		this.baseImage = baseImage;
	}
	
	@Column
	public String getLogo(){
		return this.logo;
	}
	
	public void setLogo(String logo){
		this.logo = logo;
	}
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "enterBasicInfo")
	public Set<EnterAirInfo> getEnterAirInfos() {
		return this.enterAirInfos;
	}

	public void setEnterAirInfos(
			Set<EnterAirInfo> enterAirInfos) {
		this.enterAirInfos = enterAirInfos;
	}
	
	@Column(name = "DelFlag", length = 1)
	public void setDelFlag(String delFlag){
		this.delFlag = delFlag;
	}
	
	public String getDelFlag(){
		return delFlag;
	}
	
}