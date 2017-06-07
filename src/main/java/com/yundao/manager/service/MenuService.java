package com.yundao.manager.service;

import java.util.List;

import com.jzp.framework.mapper.MyMapper;
import com.jzp.framework.service.BaseService;
import com.yundao.manager.bean.MenuAndOperate;
import com.yundao.manager.enumType.MenuEnum;
import com.yundao.manager.model.rbac.Menu;

/**
 * 
 * @ClassName: MenuService
 * @Description: 菜单
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午1:49:59
 */
public interface MenuService extends BaseService<Menu> {

	/**
	 * 
	 * @Title: getMenuWithOperate
	 * @Description: 获取菜单和菜单的所属动作
	 * @param roleId
	 * @param upMenuId
	 * @return
	 * @return: List<MenuAndOperate>
	 */
	public List<MenuAndOperate> getMenuWithOperate(Long roleId, Long upMenuId);
}
