package com.pagoda.design.creationModel.factory.factoryMethod.method;

public class CeilingFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new CeilingFan();
	}

}
