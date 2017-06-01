package com.yundao.manager.model.manager;

import javax.persistence.Column;
import javax.persistence.Table;

import com.jzp.framework.model.PriorityEntity;

/**
 * 
 * @ClassName: Dept
 * @Description: 部门实体类
 * @author: jinzhaopo
 * @version: V1.0
 * @date: 2017年6月1日 上午11:07:24
 */
@Table(name = "t_rbac_dept")
public class Dept extends PriorityEntity {

	private static final long serialVersionUID = -5205871485867540908L;
	/**
	 * 部门名称
	 */
	@Column(nullable = false, unique = true)
	private String name;
	/**
	 * 部门编号
	 */
	@Column(nullable = false, unique = true)
	private String code;

	/* link */
	/**
	 * 上级部门
	 */
	@Column(name = "up_dept_id")
	private Long upDeptId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getUpDeptId() {
		return upDeptId;
	}

	public void setUpDeptId(Long upDeptId) {
		this.upDeptId = upDeptId;
	}
	
	

}
