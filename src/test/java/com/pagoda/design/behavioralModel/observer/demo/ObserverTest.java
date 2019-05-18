package com.pagoda.design.behavioralModel.observer.demo;

/**
 * 观察者模式,又称发布/订阅模式
 */
public class ObserverTest {
 
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.add(new Observer3());		
		sub.operation();
	}
 
}
