package com.pagoda.design.creationModel.factory.factoryMethod.method;

public class PropellerFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new PropellerFan();
	}

}
