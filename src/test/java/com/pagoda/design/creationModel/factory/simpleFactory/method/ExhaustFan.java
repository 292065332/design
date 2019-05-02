package com.pagoda.design.creationModel.factory.simpleFactory.method;

public class ExhaustFan implements IFan {

	@Override
	public void switchOn() {
		System.out.println("The ExhaustFan is switched on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The ExhaustFan is switched off ...");
	}
}
