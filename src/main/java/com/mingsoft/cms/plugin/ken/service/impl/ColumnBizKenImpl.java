package com.mingsoft.cms.plugin.ken.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingsoft.basic.entity.ColumnEntity;
import com.mingsoft.cms.plugin.ken.dao.ICloumnKenDao;
import com.mingsoft.cms.plugin.ken.service.IColumnBizKen;

@Service
public class ColumnBizKenImpl implements IColumnBizKen{

	@Autowired
	private ICloumnKenDao iCloumnKenDao;
	
	@Override
	public List<ColumnEntity> queryChild(Map<String, Object> condition){

		
		return iCloumnKenDao.queryChild(condition);
	}

	@Override
	public List<ColumnEntity> queryAll(Map<String, Object> condition) {
		
		return iCloumnKenDao.queryByAppIdAndModelId(condition);
	}
	
}
