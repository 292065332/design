package com.pagoda.design.behavioralModel.observer.weather;


/**
 *  抽象观察者角色（Observer）
 */
interface Observer {
    //当气象观测值改变时，主题会把这些状态值当作方法的参数，传送给观察者
    public void update(float temp,float humidity,float pressure);
}