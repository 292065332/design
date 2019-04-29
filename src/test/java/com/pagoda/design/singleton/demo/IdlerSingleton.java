package com.pagoda.design.singleton.demo;

/**
 * 懒汉式 - 线程不安全
 */
public class IdlerSingleton {
    private static IdlerSingleton instance;
    private IdlerSingleton(){}
    public static IdlerSingleton getInstance(){
        if (instance == null) {
            instance = new IdlerSingleton();
        }
        return instance;
    }
}