package com.pagoda.design.factory.abstractFactory.method;

public class USElectricalFactory  implements IElectricalFactory {

	public IFan createFan() {
		return new USFan();
	}

	public ITubeLight createTubeLight() {
		return new USTubeLight();
	}

}