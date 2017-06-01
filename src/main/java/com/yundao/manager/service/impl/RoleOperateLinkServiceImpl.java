package com.yundao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.mapper.RoleOperateLinkMapper;
import com.yundao.manager.model.link.RoleOperateLink;
import com.yundao.manager.service.RoleOperateLinkService;

/**
 * 
 * @ClassName: RoleOperateLinkServiceImpl
 * @Description: TODO
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午3:55:15
 */
@Service
@Transactional(readOnly = true)
public class RoleOperateLinkServiceImpl extends BaseServiceImpl<RoleOperateLink> implements RoleOperateLinkService {

	@Autowired
	private RoleOperateLinkMapper roleOperateLinkMapper;

	@Autowired
	public void setMapper(RoleOperateLinkMapper mapper) {
		super.setMapper(mapper);
	}
}
