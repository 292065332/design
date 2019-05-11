package com.pagoda.design.structuralModel.adapter.demo;

/**
 * 适配器 (类适配器方式)
 * (相当于 高清线/vga 的转接头)
 * @author Administrator
 *
 */
public class Adapter extends Adaptee implements Target {
	@Override
	public void handleReq() {
		super.request();
	}
}
