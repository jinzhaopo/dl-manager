package com.yundao.manager.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.jzp.framework.config.shiro.MyShiroRealm;
import com.yundao.manager.model.rbac.Admin;
import com.yundao.manager.service.AdminService;

/**
 * 
 * @ClassName: DlShiroRealm
 * @Description: 核心身份验核
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月4日 下午9:28:16
 */
public class DlShiroRealm extends MyShiroRealm {

	@Autowired
	private AdminService adminService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println();
		return null;
	}

	/**
	 * 
	 * @Title: doGetAuthenticationInfo
	 * @Description: 身份验证
	 * @param token
	 *            用来身份验证的
	 * @return
	 * @throws AuthenticationException
	 * @see com.jzp.framework.config.shiro.MyShiroRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		UsernamePasswordToken upToken = (UsernamePasswordToken) token;
		System.out.println(upToken.getPassword().toString()+"--------"+getName());

		// 获取用户的输入的账号.
		String username = (String) token.getPrincipal();
		Admin admin = adminService.get("name", username);

		if (admin == null) {
			return null;
		}

		// 账号判断;

		// 加密方式;
		// 交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
		// SimpleAuthenticationInfo authenticationInfo = new
		// SimpleAuthenticationInfo(
		// userInfo, //用户名
		// userInfo.getPassword(), //密码
		// ByteSource.Util.bytes(userInfo.getCredentialsSalt()),//salt=username+salt
		// getName() //realm name
		// );

		// 明文: 若存在，将此用户存放到登录认证info中，无需自己做密码对比，Shiro会为我们进行密码对比校验
		SimpleAccount authenticationInfo = new SimpleAccount(admin, // 用户名
				admin.getPassword(), // 密码
				getName() // realm name
		);

		return authenticationInfo;
	}

}
