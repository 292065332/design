package com.pagoda.design.creationModel.singleton.demo;

/**
 * 懒汉式 - 线程安全
 */
public class IdlerSingleton2 {
    private static IdlerSingleton2 instance;
    private IdlerSingleton2(){}
    public static synchronized IdlerSingleton2 getInstance(){
        if (instance == null) {
            instance = new IdlerSingleton2();
        }
        return instance;
    }
}