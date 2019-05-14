package com.pagoda.design.structuralModel.bridge.computerDemo.computer;

import com.pagoda.design.structuralModel.bridge.computerDemo.brand.Brand;

/**
 * 定义电脑类型: 笔记本
 */
public class Laptop extends Computer {

	public Laptop(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("笔记本");
	}
}