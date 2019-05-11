package com.pagoda.design.structuralModel.bridge.computerDemo.brand;

/**
 * 定义品牌类型: 戴尔
 */
public class Dell implements Brand {

	@Override
	public void sale() {
		System.out.println("销售Dell电脑");
	}

}