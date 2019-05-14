package com.pagoda.design.structuralModel.proxy.feiche.dynamic;



import com.pagoda.design.structuralModel.proxy.feiche.IBuyCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理角色
 */
public class BuyCarHandler implements InvocationHandler {

	private IBuyCar buyCar;

	public BuyCarHandler(IBuyCar buyCar) {
		this.buyCar = buyCar;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object = null;
		if(method.getName().equals("buyCar")){
			object = method.invoke(buyCar, args);
		}
		return object;
	}
}
