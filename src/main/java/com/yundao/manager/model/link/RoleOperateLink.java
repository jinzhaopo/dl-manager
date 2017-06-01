package com.yundao.manager.model.link;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.jzp.framework.model.BaseEntity;
import com.yundao.manager.model.rbac.Operate;
import com.yundao.manager.model.rbac.Role;

/**
 * 
 * @ClassName: RoleOperate
 * @Description: 角色菜单关联表
 * @author: jinzhaopo
 * @date: 2015-5-26 下午12:54:03
 */
@Table(name = "t_link_role_operate")
public class RoleOperateLink extends BaseEntity {

	private static final long serialVersionUID = -6775809449005015769L;

	@NotNull
	@Column(name = "role_id", nullable = false)
	private Long roleId;

	@NotNull
	@Column(name = "operate_id", nullable = false)
	private Long operateId;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getOperateId() {
		return operateId;
	}

	public void setOperateId(Long operateId) {
		this.operateId = operateId;
	}
}
