package com.green.modules.rs.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Industrytype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_industry", catalog = "jeesite")
public class IndustryType {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 7478904823645963961L;
	private String industryCode;
	private IndustryType parent;
	private String parents;
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
			IndustryType parent,
			String parents,
			Set<EnterBasicInfo> enterbasicinfos,
			Set<IndustryAirStandard> industryairqualitystandards) {
		this.industryName = industryName;
		this.parents = parents;
		this.parent = parent;
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="parent")
	public IndustryType getParent(){
		return this.parent;
	}
	
	public void setParent(IndustryType parent){
		this.parent = parent;
	}
	
	@Column(name = "parents")
	public String getParents(){
		return this.parents;
	}
	
	public void setParents(String parents){
		this.parents = parents;
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
	
	@Transient
	public static void sortList(List<IndustryType> list, List<IndustryType> sourcelist, String parentId){
		for (int i=0; i<sourcelist.size(); i++){
			IndustryType e = sourcelist.get(i);
			if (e.getParent()!=null && e.getParent().getIndustryCode()!=null
					&& e.getParent().getIndustryCode().equals(parentId)){
				list.add(e);
				// 判断是否还有子节点, 有则继续获取子节点
				for (int j=0; j<sourcelist.size(); j++){
					IndustryType child = sourcelist.get(j);
					if (child.getParent()!=null && child.getParent().getIndustryCode()!=null
							&& child.getParent().getIndustryCode().equals(e.getIndustryCode())){
						sortList(list, sourcelist, e.getIndustryCode());
						break;
					}
				}
			}
		}
	}
	

}