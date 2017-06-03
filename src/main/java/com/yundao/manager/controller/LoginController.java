package com.yundao.manager.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @ClassName: LoginController
 * @Description: 登入controller
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年5月30日 下午7:42:13
 */
@Controller
public class LoginController extends BaseController {

	/**
	 * 
	 * @Title: login
	 * @Description: 登入页面
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	/**
	 * 
	 * @Title: login
	 * @Description: 页面登入
	 * @param request
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {

		return "/login";
	}

	/**
	 * 
	 * @Title: index
	 * @Description: TODO
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = { "/index", "/" })
	public String index() {
		return "index";
	}
}
