package com.yundao.manager.model.link;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.jzp.framework.model.BaseEntity;
import com.yundao.manager.model.rbac.Menu;
import com.yundao.manager.model.rbac.Role;

/**
 * 
 * @ClassName: RoleMenu
 * @Description: 角色菜单关联表
 * @author: jinzhaopo
 * @date: 2015-5-26 下午12:53:01
 */
@Table(name = "t_link_role_menu")
public class RoleMenuLink extends BaseEntity {

	private static final long serialVersionUID = -5505926453653902340L;

	@NotNull
	@Column(name = "role_id",nullable=false)
	private Long roleId;

	@NotNull
	@Column(name = "menu_id")
	private Long menuId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

}
