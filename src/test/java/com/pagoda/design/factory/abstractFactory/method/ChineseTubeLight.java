package com.pagoda.design.factory.abstractFactory.method;

public class ChineseTubeLight implements ITubeLight {
	public void swithOn() {
		System.out.println("The ChineseTubeLight is swithed on ...");
	}

	public void switchOff() {
		System.out.println("The ChineseTubeLight is swithed off ...");
	}

	public void tuneLight() {
		System.out.println("The ChineseTubeLight is tuned ...");
		
	}
}
