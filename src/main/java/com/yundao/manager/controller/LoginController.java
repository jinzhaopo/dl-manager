package com.yundao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping(value = { "/", "/login" })
	public String login() {
		return "login";
	}
}
