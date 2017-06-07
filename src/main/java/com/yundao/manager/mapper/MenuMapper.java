package com.yundao.manager.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jzp.framework.mapper.MyMapper;
import com.yundao.manager.bean.MenuAndOperate;
import com.yundao.manager.enumType.MenuEnum;
import com.yundao.manager.model.rbac.Menu;

/**
 * 
 * @ClassName: MenuMapper
 * @Description: 菜单
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午1:48:09
 */
public interface MenuMapper extends MyMapper<Menu> {

	/**
	 * 
	 * @Title: getMenuWithOperate
	 * @Description: 获取菜单以及菜单的所属动作
	 * @param adminId
	 * @param upMenuId
	 * @param menuEnum
	 * @return
	 * @return: List<MenuAndOperate>
	 */
	List<MenuAndOperate> getMenuWithOperate(@Param("roleId") Long roleId, @Param("upMenuId") Long upMenuId);

}
