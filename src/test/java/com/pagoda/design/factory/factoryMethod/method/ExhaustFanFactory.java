package com.pagoda.design.factory.factoryMethod.method;

public class ExhaustFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new ExhaustFan();
	}

}
