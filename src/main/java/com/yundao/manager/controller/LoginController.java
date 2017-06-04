package com.yundao.manager.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
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
		String exception = (String) request.getAttribute("shiroLoginFailure");
		String msg = "";
		if (exception != null) {
			if (UnknownAccountException.class.getName().equals(exception)) {
				System.out.println("UnknownAccountException -- > 账号不存在：");
				msg = "UnknownAccountException -- > 账号不存在：";
			} else if (IncorrectCredentialsException.class.getName().equals(exception)) {
				System.out.println("IncorrectCredentialsException -- > 密码不正确：");
				msg = "IncorrectCredentialsException -- > 密码不正确：";
			} else if ("kaptchaValidateFailed".equals(exception)) {
				System.out.println("kaptchaValidateFailed -- > 验证码错误");
				msg = "kaptchaValidateFailed -- > 验证码错误";
			} else {
				msg = "else >> " + exception;
				System.out.println("else -- >" + exception);
			}
		}
		model.addAttribute("msg", msg);
		// 此方法不处理登录成功,由shiro进行处理.
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
