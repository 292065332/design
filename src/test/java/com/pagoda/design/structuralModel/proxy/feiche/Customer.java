package com.pagoda.design.structuralModel.proxy.feiche;

import lombok.Data;

/**
 * 真实角色
 */
@Data
public class Customer implements IBuyCar {

	//购车款
	private int cash;

	@Override
	public void buyCar() {
		System.out.println("买一辆车花费了-->" + cash + "元");
	}
}