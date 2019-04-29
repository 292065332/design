package com.pagoda.design.factory.factoryMethod.method;

public class TableFanFactory implements IFanFactory {

	@Override
	public IFan createFan() {
		return new TableFan();
	}

}
