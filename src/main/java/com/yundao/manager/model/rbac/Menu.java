package com.yundao.manager.model.rbac;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.jzp.framework.model.PriorityEntity;
import com.yundao.manager.enumType.MenuEnum;

/**
 * 
 * @ClassName: Menu
 * @Description: 菜单
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 上午9:50:43
 */
@Table(name = "t_rbac_menu")
public class Menu extends PriorityEntity {

	private static final long serialVersionUID = -3236939895702524477L;

	/**
	 * 菜单的名称
	 */
	@NotBlank
	@Column(nullable = false, unique = true)
	private String name;
	/**
	 * 菜单类型
	 */
	@NotNull
	@Column(name = "menu_enum")
	private MenuEnum menuEnum;

	/**
	 * 资源图标路径
	 */
	@Column(name = "menu_icon", unique = true)
	private String menuIcon;

	/**
	 * 菜单编号
	 */
	@Column(name = "menu_no")
	private String menuNo;

	/**
	 * 描述
	 */
	private String description;

	/* link */
	/**
	 * 上级菜单
	 */
	@Column(name = "up_menu_id")
	private Long upMenuId;
	/**
	 * 操作id
	 */
	@Column(name = "operate_id")
	private Long operateId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MenuEnum getMenuEnum() {
		return menuEnum;
	}

	public void setMenuEnum(MenuEnum menuEnum) {
		this.menuEnum = menuEnum;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getUpMenuId() {
		return upMenuId;
	}

	public void setUpMenuId(Long upMenuId) {
		this.upMenuId = upMenuId;
	}

	public Long getOperateId() {
		return operateId;
	}

	public void setOperateId(Long operateId) {
		this.operateId = operateId;
	}

}
