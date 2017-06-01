package com.yundao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.mapper.MyMapper;
import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.mapper.DeptMapper;
import com.yundao.manager.model.manager.Dept;
import com.yundao.manager.service.DeptService;

/**
 * 
 * @ClassName: DeptServiceImpl
 * @Description: 部门
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午1:39:36
 */
@Service
@Transactional(readOnly = true)
public class DeptServiceImpl extends BaseServiceImpl<Dept> implements DeptService {

	@Autowired
	private DeptMapper deptMapper;

	@Autowired
	public void setMapper(DeptMapper mapper) {
		super.setMapper(mapper);
	}
}
