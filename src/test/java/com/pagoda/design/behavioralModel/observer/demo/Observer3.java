package com.pagoda.design.behavioralModel.observer.demo;

/**
 * 具体观察者角色（Concrete Observer）
 */
public class Observer3 implements Observer {
 
	@Override
	public void update() {
		System.out.println("observer3 has received!");
	}
 
}