package com.pagoda.design.factory.factoryMethod.method;

public class PropellerFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new PropellerFan();
	}

}
