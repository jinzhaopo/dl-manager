package com.yundao.manager.enumType;

/**
 * 
 * @ClassName: MenuEnum
 * @Description: 菜单类型
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 上午10:07:06
 */
public enum MenuEnum {
	FIRST_MENU("一级菜单"), SECONE_MENU("二级菜单"), THIRD_MENU("三级菜单");

	private MenuEnum(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
