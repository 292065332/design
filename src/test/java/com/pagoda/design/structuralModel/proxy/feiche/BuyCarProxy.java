package com.pagoda.design.structuralModel.proxy.feiche;

/**
 * 代理角色
 */
public class BuyCarProxy implements IBuyCar {
	//接收买车客户
	private Customer customer;

	//接收买车客户
	public BuyCarProxy(Customer customer) {
		this.customer = customer;
	}

	//实现为客户买车
	@Override
	public void buyCar() {
		customer.buyCar();
	}
}
