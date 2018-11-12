package com.mingsoft.cms.plugin.ken.service;

import java.util.List;
import java.util.Map;

import com.mingsoft.basic.entity.ColumnEntity;

public interface IColumnBizKen {

	List<ColumnEntity> queryChild(Map<String, Object> condition);

	List<ColumnEntity> queryAll(Map<String, Object> condition);

}
