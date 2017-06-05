package com.yundao.manager;

import java.util.Map;

import com.jzp.framework.util.EnumUtils;
import com.yundao.manager.enumType.MenuEnum;
/**
 * 
 * @ClassName: ViewStaticModels
 * @Description: freemarker 页面可以直接调用
 * @author: jinzhaopo
 * @version: V1.0 
 * @date: 2017年6月5日 上午11:26:52
 */
public class ViewStaticModels {

	
	/**
	 * 
	 * @Title: getMenuTypes
	 * @Description: 转换菜单类型
	 * @return
	 * @return: Map<String,String>
	 */
	public static Map<String, String> getMenuTypes() {
		return EnumUtils.enumProp2NameMap(MenuEnum.class, "name");
	}
}
