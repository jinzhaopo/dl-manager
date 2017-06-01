package com.yundao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.mapper.RoleMenuLinkMapper;
import com.yundao.manager.model.link.RoleMenuLink;
import com.yundao.manager.service.RoleMenuLinkService;

/**
 * 
 * @ClassName: RoleMenuLinkServiceImpl
 * @Description:
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午3:08:50
 */
@Service
@Transactional(readOnly = true)
public class RoleMenuLinkServiceImpl extends BaseServiceImpl<RoleMenuLink> implements RoleMenuLinkService {

	@Autowired
	private RoleMenuLinkMapper roleMenuLinkMapper;

	@Autowired
	public void setMapper(RoleMenuLinkMapper mapper) {
		super.setMapper(mapper);
	}
}
