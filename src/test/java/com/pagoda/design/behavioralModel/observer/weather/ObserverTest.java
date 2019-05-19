package com.pagoda.design.behavioralModel.observer.weather;

import com.pagoda.design.behavioralModel.observer.demo.MySubject;
import com.pagoda.design.behavioralModel.observer.demo.Observer1;
import com.pagoda.design.behavioralModel.observer.demo.Observer2;
import com.pagoda.design.behavioralModel.observer.demo.Observer3;

public class ObserverTest {
 
	public static void main(String[] args) {
		WeatherData subject = new WeatherData();
		new CurrentConditionDisplay(subject);
		subject.measurementsChanged();
	}
 
}