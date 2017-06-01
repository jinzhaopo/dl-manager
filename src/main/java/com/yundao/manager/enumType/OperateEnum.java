package com.yundao.manager.enumType;

/**
 * 
 * @ClassName: OperateEnum
 * @Description: 动作的类型
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 下午2:20:19
 */
public enum OperateEnum {
	authorization("授权动作"), unauthorized("未授权动作");

	private OperateEnum(String name) {
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
