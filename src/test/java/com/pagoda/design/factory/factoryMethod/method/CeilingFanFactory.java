package com.pagoda.design.factory.factoryMethod.method;

public class CeilingFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new CeilingFan();
	}

}
