package com.yundao.manager.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.model.rbac.Role;
import com.yundao.manager.service.RoleService;

/**
 * 
 * @ClassName: RoleServiceImpl
 * @Description: 角色
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午2:52:02
 */
@Service
@Transactional(readOnly = true)
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

}
