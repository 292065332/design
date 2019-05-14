package com.pagoda.design.structuralModel.proxy.feiche;

import com.pagoda.design.structuralModel.proxy.dynamic.Star;
import com.pagoda.design.structuralModel.proxy.feiche.dynamic.BuyCarHandler;

import java.lang.reflect.Proxy;

/**
 * @author JiangWJ
 * @date 2019/5/14 
 * @description
 */
public class Client{

	public static void main(String[] args) {
		// 假定我有一个客户要买车
		Customer customer=new Customer();
		customer.setCash(120000);

		BuyCarHandler handler = new BuyCarHandler(customer);
		IBuyCar iBuyCar = (IBuyCar) Proxy
				.newProxyInstance(ClassLoader.getSystemClassLoader(),
						new Class[]{IBuyCar.class}, handler);
		iBuyCar.buyCar();

	}

}
