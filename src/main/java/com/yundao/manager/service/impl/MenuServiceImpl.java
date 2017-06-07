package com.yundao.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jzp.framework.mapper.MyMapper;
import com.jzp.framework.service.impl.BaseServiceImpl;
import com.yundao.manager.bean.MenuAndOperate;
import com.yundao.manager.enumType.MenuEnum;
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

	/**
	 * 
	 * @Title: getMenuWithOperate
	 * @Description: 获取菜单以及菜单的所属动作
	 * @param adminId
	 * @param upMenuId
	 * @param menuEnum
	 * @return
	 * @see com.yundao.manager.service.MenuService#getMenuWithOperate(java.lang.Long,
	 *      java.lang.Long, com.yundao.manager.enumType.MenuEnum)
	 */
	public List<MenuAndOperate> getMenuWithOperate(Long roleId, Long upMenuId) {
		return menuMapper.getMenuWithOperate(roleId, upMenuId);
	}

}
