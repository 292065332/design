package com.pagoda.design.creationModel.factory.abstractFactory.method;

// 电器工厂接口
public interface IElectricalFactory {
	
	IFan createFan();
	
	ITubeLight createTubeLight();
}
