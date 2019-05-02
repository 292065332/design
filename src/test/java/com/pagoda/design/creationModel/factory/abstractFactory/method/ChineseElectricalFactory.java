package com.pagoda.design.creationModel.factory.abstractFactory.method;

public class ChineseElectricalFactory implements IElectricalFactory {

	public IFan createFan() {
		return new ChineseFan();
	}

	public ITubeLight createTubeLight() {
		return new ChineseTubeLight();
	}

}
