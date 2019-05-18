package com.pagoda.design.behavioralModel.observer.demo;

/**
 * 具体目标角色（Concrete Subject）
 */
public class MySubject extends AbstractSubject {
 
	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}
 
}