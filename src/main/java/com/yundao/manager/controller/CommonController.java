package com.yundao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName: CommonController
 * @Description: 公共的controller
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月5日 下午3:58:53
 */
@Controller
public class CommonController {

	/**
	 * 
	 * @Title: notFind
	 * @Description: 404页面
	 * @return
	 * @return: String
	 */
	@RequestMapping(value = "/notFind")
	public String notFind() {
		return "404";
	}
}
