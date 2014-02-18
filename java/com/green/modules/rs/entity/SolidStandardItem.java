package com.green.modules.rs.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.green.common.persistence.IdEntity;

/**
 * Solidqualitystandarditem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "rs_solidstandard", catalog = "jeesite")
public class SolidStandardItem extends IdEntity<SolidStandardItem>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1929517683594515655L;
	private String itemName;
	private String itemUnit;
	private String enterScope; // 使用范围
	private Double gbValue = 0.0;
	private List<EnterSolidInfo> enterSolidInfos = new ArrayList<EnterSolidInfo>(
			0);

	// Constructors

	/** default constructor */
	public SolidStandardItem() {
	}

	/** minimal constructor */
	public SolidStandardItem(String itemName, String enterScope,
			String itemUnit) {
		this.itemName = itemName;
		this.enterScope = enterScope;
		this.itemUnit = itemUnit;
	}

	/** full constructor */
	public SolidStandardItem(String itemName, String enterScope,
			String itemUnit,
			List<EnterSolidInfo> enterSolidInfos) {
		this.itemName = itemName;
		this.enterScope = enterScope;
		this.itemUnit = itemUnit;
		this.enterSolidInfos = enterSolidInfos;
	}


	@Column(name = "ItemName", nullable = false, length = 30)
	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Column(name = "EnterScope")
	public String getEnterScope() {
		return this.enterScope;
	}

	public void setEnterScope(String enterScope) {
		this.enterScope = enterScope;
	}

	@Column(name = "ItemUnit", nullable = false, length = 15)
	public String getItemUnit() {
		return this.itemUnit;
	}

	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	
	@Column(name="gbValue")
	public double getGbValue() {
		return gbValue;
	}

	public void setGbValue(Double gbValue) {
		this.gbValue = gbValue;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "solidStandardItem")
	public List<EnterSolidInfo> getEnterSolidInfos() {
		return this.enterSolidInfos;
	}

	public void setEnterSolidInfos(
			List<EnterSolidInfo> enterSolidInfos) {
		this.enterSolidInfos = enterSolidInfos;
	}

}