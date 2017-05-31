package com.yundao.manager.model.rbac;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.jzp.framework.model.BaseEntity;

/**
 * 
 * @ClassName: Admin
 * @Description: 用户
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年5月31日 下午8:56:55
 */
@Table(name = "t_rbac_admin")
public class Admin extends BaseEntity {
	/**
	 * 用户名
	 */
	@NotBlank(message = "用户名不能为空")
	private String name;

	/**
	 * 电话
	 */
	@NotBlank(message = "电话号码不能为空")
	private String phone;

	/**
	 * 邮箱
	 */
	@Email(message = "邮箱格式不正确")
	@NotBlank(message = "邮箱不能为空")
	private String email;

	/**
	 * 密码
	 */
	@NotBlank
	private String password;

	/**
	 * 最后登入的时间
	 */
	@NotNull
	@Column(name = "last_login_date")
	private Date lastLoginDate;
	/**
	 * 最后登入的ip
	 */
	@NotBlank
	@Column(name = "last_login_id")
	private String lastLoginIp;
	/**
	 * 登入的失败次数
	 */
	@Column(name = "login_failure_count")
	@NotNull
	private Integer loginFailureCount;
	
	

}
