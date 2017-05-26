package com.yundao.manager.model;

import javax.persistence.Table;

import com.jzp.framework.model.BaseEntity;

@Table(name = "s_test")
public class STest extends BaseEntity {

	private static final long serialVersionUID = -8285649102167223788L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
