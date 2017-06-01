package com.yundao.manager.model.rbac;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import com.jzp.framework.model.PriorityEntity;

/**
 * 
 * @ClassName: Role
 * @Description: 角色
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 上午10:15:13
 */
@Table(name = "t_rabc_role")
public class Role extends PriorityEntity {

	private static final long serialVersionUID = -9216987580320703659L;

	/**
	 * 角色名称
	 */
	@NotBlank
	@Column(nullable = false, unique = true)
	private String name;

	/**
	 * 角色标识
	 */
	@NotNull
	@Column(nullable = false, unique = true)
	private String value;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 系统内置角色
	 */
	@Column(name="system_role")
	private Boolean systemRole;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Boolean getSystemRole() {
		return systemRole;
	}

	public void setSystemRole(Boolean systemRole) {
		this.systemRole = systemRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
