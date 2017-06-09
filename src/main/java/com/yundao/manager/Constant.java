package com.yundao.manager;

/**
 * 
 * @ClassName: Constant
 * @Description: 常量类
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月5日 上午9:52:35
 */
public final class Constant {
	
	/**
	 * 做权限管理的时候的标识  项目启动的时候会把角色和权限绑定到applicationContext中
	 */
	public static final String APPLICATION_URL_ROLE = "urlRole";
	
	/**
	 * 当前登入的用户session       自己增加
	 */
	public static final String CURRENT_ADMIN = "current_admin";
	/**
	 * 登入的请求                                                 自己增加
	 */
	public static final String LOGINURL = "/admin/login.jhtml";


}
