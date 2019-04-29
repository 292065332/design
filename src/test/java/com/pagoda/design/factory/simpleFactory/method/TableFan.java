package com.pagoda.design.factory.simpleFactory.method;

public class TableFan implements IFan {

	@Override
	public void switchOn() {
		System.out.println("The TableFan is switched on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The TableFan is switched off ...");
	}

}
