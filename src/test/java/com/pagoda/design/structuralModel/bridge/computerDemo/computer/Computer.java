package com.pagoda.design.structuralModel.bridge.computerDemo.computer;

import com.pagoda.design.structuralModel.bridge.computerDemo.brand.Brand;

/**
 * 定义电脑
 */
public class Computer {

	protected Brand brand;

	public Computer(Brand b) {
		this.brand = b;
	}

	public void sale() {
		brand.sale();
	}

}