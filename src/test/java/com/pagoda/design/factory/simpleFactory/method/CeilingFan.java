package com.pagoda.design.factory.simpleFactory.method;

public class CeilingFan implements IFan {

	@Override
	public void switchOn() {
		System.out.println("The CeilingFan is switched on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The CeilingFan is switched off ...");
	}
}
