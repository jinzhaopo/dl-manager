package com.yundao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.mapper.OperateMapper;
import com.yundao.manager.model.rbac.Operate;
import com.yundao.manager.service.OperateService;

/**
 * 
 * @ClassName: OperateServiceImpl
 * @Description: 操作
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午2:34:59
 */
@Service
@Transactional(readOnly = true)
public class OperateServiceImpl extends BaseServiceImpl<Operate> implements OperateService {

	@Autowired
	private OperateMapper operateMapper;

	@Autowired
	public void setMapper(OperateMapper mapper) {
		super.setMapper(mapper);
	}
}
