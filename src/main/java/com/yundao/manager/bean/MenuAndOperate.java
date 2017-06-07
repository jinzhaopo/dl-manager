package com.yundao.manager.bean;

import java.io.Serializable;

import com.yundao.manager.enumType.MenuEnum;

/**
 * 
 * @ClassName: MenuAndOperate
 * @Description: 菜单和动作
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月7日 上午9:24:13
 */
public class MenuAndOperate implements Serializable {
	
	private Long menuId;
	/**
	 * 菜单名称
	 */
	private String menuName;

	/**
	 * 资源图标路径
	 */
	private String menuIcon;

	/**
	 * 上级菜单
	 */
	private Long upMenuId;

	/**
	 * 操作名称
	 */
	private String operateName;

	/**
	 * 按钮图标路径
	 */
	private String btnIcon;

	/**
	 * 页面内容
	 */
	private String html;

	/**
	 * 是否显示在图标工具栏上
	 */
	private Boolean diaplayInToolBar;
	
	

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuIcon() {
		return menuIcon;
	}

	public void setMenuIcon(String menuIcon) {
		this.menuIcon = menuIcon;
	}

	public Long getUpMenuId() {
		return upMenuId;
	}

	public void setUpMenuId(Long upMenuId) {
		this.upMenuId = upMenuId;
	}

	public String getOperateName() {
		return operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	public String getBtnIcon() {
		return btnIcon;
	}

	public void setBtnIcon(String btnIcon) {
		this.btnIcon = btnIcon;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public Boolean getDiaplayInToolBar() {
		return diaplayInToolBar;
	}

	public void setDiaplayInToolBar(Boolean diaplayInToolBar) {
		this.diaplayInToolBar = diaplayInToolBar;
	}

}
