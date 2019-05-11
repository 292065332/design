package com.pagoda.design.structuralModel.bridge.computerDemo.computer;

import com.pagoda.design.structuralModel.bridge.computerDemo.brand.Brand;

/**
 * 定义电脑类型: 台式机
 */
public class Desktop extends Computer {

	public Desktop(Brand b) {
		super(b);
	}

	@Override
	public void sale() {
		super.sale();
		System.out.println("销售台式机");
	}
}