package com.yundao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.mapper.MyMapper;
import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.mapper.AdminMapper;
import com.yundao.manager.model.rbac.Admin;
import com.yundao.manager.service.AdminService;

/**
 * 
 * @ClassName: AdminServiceImpl
 * @Description: 用户serviceimpl
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 上午11:30:42
 */
@Service
@Transactional(readOnly = true)
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService {
	
	@Autowired
	private AdminMapper AdminMapper;
	
	@Autowired
	public void setMapper(AdminMapper mapper) {
		super.setMapper(mapper);
	}

}
