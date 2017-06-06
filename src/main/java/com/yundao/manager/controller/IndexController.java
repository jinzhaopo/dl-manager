package com.yundao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName: IndexController
 * @Description: 首页controller
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月6日 下午9:31:58
 */
@Controller
public class IndexController extends BaseController {

	/**
	 * 
	 * @Title: index
	 * @Description: 首页
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = "/index")
	public String index() {
		return "/common/index";
	}

	/**
	 * 
	 * @Title: main
	 * @Description: 这个页面主要分左边的导航和右边的主功能区
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = "/main")
	public String main() {
		return "/common/main";
	}

	/**
	 * 
	 * @Title: nav
	 * @Description: 左边的导航
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = "/nav")
	public String nav() {
		return "/common/nav";
	}

	/**
	 * 
	 * @Title: content
	 * @Description: 主要的操作内容(默认以时间的页面)
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = "/content")
	public String content() {
		return "/common/content";
	}
}
