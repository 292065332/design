package com.pagoda.design.factory.abstractFactory.method;

public class USTubeLight implements ITubeLight {
	public void swithOn() {
		System.out.println("The USTubeLight is swithed on ...");
	}

	public void switchOff() {
		System.out.println("The USTubeLight is swithed off ...");
	}

	public void tuneLight() {
		System.out.println("The USTubeLight is tuned ...");	
	}
}