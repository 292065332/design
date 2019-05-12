package com.pagoda.design.structuralModel.adapter.demo;

/**
 * 被适配的类
 * (相当于例子中的，vga 接口的投影仪)
 * @author Administrator
 *
 */
public class Adaptee {
	
	public void request(){
		System.out.println("实现投影功能！");
	}
}

