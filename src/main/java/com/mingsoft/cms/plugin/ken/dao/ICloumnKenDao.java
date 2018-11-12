package com.mingsoft.cms.plugin.ken.dao;

import java.util.List;
import java.util.Map;

import com.mingsoft.basic.entity.ColumnEntity;

public interface ICloumnKenDao {

	List<ColumnEntity> queryChild(Map<String, Object> condition);
	
	List<ColumnEntity> queryByAppIdAndModelId(Map<String, Object> condition);
	
}
