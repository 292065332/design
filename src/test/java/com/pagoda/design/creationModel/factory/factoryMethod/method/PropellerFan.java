package com.pagoda.design.creationModel.factory.factoryMethod.method;

// 螺旋桨式通风扇
public class PropellerFan implements IFan {

	@Override
	public void swithOn() {
		System.out.println("The PropellerFan is swithed on ...");
	}

	@Override
	public void switchOff() {
		System.out.println("The PropellerFan is swithed off ...");
	}

}
