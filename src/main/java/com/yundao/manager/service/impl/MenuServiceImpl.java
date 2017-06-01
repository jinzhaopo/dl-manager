package com.yundao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.mapper.MyMapper;
import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.mapper.MenuMapper;
import com.yundao.manager.model.rbac.Menu;
import com.yundao.manager.service.MenuService;

/**
 * 
 * @ClassName: MenuServiceImpl
 * @Description: 菜单
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午1:50:55
 */
@Service
@Transactional(readOnly = true)
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {

	@Autowired
	private MenuMapper menuMapper;

	@Autowired
	public void setMapper(MenuMapper mapper) {
		super.setMapper(mapper);
	}

}
