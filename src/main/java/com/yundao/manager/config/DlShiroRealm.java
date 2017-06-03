package com.yundao.manager.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;

import com.jzp.framework.config.shiro.MyShiroRealm;

public class DlShiroRealm extends MyShiroRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("AuthorizationInfo.doGetAuthorizationInfo");
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		System.out.println("AuthenticationInfo.doGetAuthenticationInfo");
		return null;
	}

}
