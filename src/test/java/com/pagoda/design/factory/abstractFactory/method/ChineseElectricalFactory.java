package com.pagoda.design.factory.abstractFactory.method;

public class ChineseElectricalFactory implements IElectricalFactory {

	public IFan createFan() {
		return new ChineseFan();
	}

	public ITubeLight createTubeLight() {
		return new ChineseTubeLight();
	}

}
