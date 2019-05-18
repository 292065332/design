package com.pagoda.design.behavioralModel.observer.weather;

import java.util.ArrayList;

/**
 * 具体目标角色（Concrete Subject）
 */
class WeatherData implements Subject{

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i=observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }
    }
    //当从气象站得到更新观测值时，我们通知观察者
    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
    //WeatherData的其他方法
}