package com.green.modules.rs.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.green.common.persistence.BaseDao;
import com.green.common.persistence.Parameter;
import com.green.modules.rs.entity.IndustryType;

@Repository
public class IndustryTypeDAO extends BaseDao<IndustryType>{
	
	public List<IndustryType> findByParentCode(String parentCode){
		return find("from IndustryType where parent.industryCode like :p1", new Parameter(parentCode));
	}
	
	
	public void deleteByCode(String code){
		IndustryType deleteItem = this.get(code);
		List<IndustryType> children = findByParentCode(code);
		if(children != null && !children.isEmpty()){
			for(IndustryType child : children){
				getSession().delete(child);
			}
		}
		getSession().delete(deleteItem);
	}

	public Map<String, List<IndustryType>> getInderstryMap(){
		Map<String, List<IndustryType>> m = new HashMap<String, List<IndustryType>>();
		//先找到所有的code
		List<IndustryType> first=find("from IndustryType where parent.industryCode like '0'", null);
//		System.out.println("一级栏目一共有"+first.size());
		m.put("first", first);
		for (int i = 0; i < first.size(); i++) {
			List<IndustryType> second=find("from IndustryType where parent.industryCode like :p1", new Parameter(first.get(i).getIndustryCode()));
//			System.out.println("二级栏目有"+second.size());
			//以福行业的id作物键
			m.put(first.get(i).getIndustryCode(), second);
			for (int j = 0; j < second.size(); j++) {
				List<IndustryType> third=find("from IndustryType where parent.industryCode like :p1", new Parameter(second.get(j).getIndustryCode()));
//				System.out.println("三级行业共有"+third.size());
				m.put(second.get(j).getIndustryCode(), third);
			}
		}
		return m;
	}
}
