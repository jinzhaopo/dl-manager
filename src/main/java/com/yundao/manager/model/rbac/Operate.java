package com.yundao.manager.model.rbac;

import javax.persistence.Column;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

import com.jzp.framework.model.PriorityEntity;
import com.yundao.manager.enumType.OperateEnum;

/**
 * 
 * @ClassName: Operate
 * @Description: 操作
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午1:58:22
 */
@Table(name = "t_rbac_operate")
public class Operate extends PriorityEntity {
	private static final long serialVersionUID = -146936450500473640L;

	/**
	 * 操作名称
	 */
	@NotBlank
	@Column(nullable = false, unique = true)
	private String name;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 按钮图标
	 */
	@Column(name = "btn_icon")
	private String btnIcon;

	/**
	 * url
	 */
	private String url;
	/**
	 * 匹配模式
	 */
	private String pattern;
	/**
	 * html页面内容
	 */
	private String html;

	/**
	 * 动作类型
	 */
	private OperateEnum type;

	/**
	 * 按钮图标显示在工具栏上
	 */
	@Column(name = "diaplay_in_tool_bar")
	private Boolean diaplayInToolBar;
	/* link */
	/**
	 * 菜单id
	 */
	@Column(name = "menu_id")
	private Long menuId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBtnIcon() {
		return btnIcon;
	}

	public void setBtnIcon(String btnIcon) {
		this.btnIcon = btnIcon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public OperateEnum getType() {
		return type;
	}

	public void setType(OperateEnum type) {
		this.type = type;
	}

	public Boolean getDiaplayInToolBar() {
		return diaplayInToolBar;
	}

	public void setDiaplayInToolBar(Boolean diaplayInToolBar) {
		this.diaplayInToolBar = diaplayInToolBar;
	}

	public Long getMenuId() {
		return menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

}
