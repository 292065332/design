package com.pagoda.design.factory;

public class Car implements Moveable{

    private String lunzi;

    private String dongzuo;

    public Car() {
        this.lunzi = "轮子";
        this.dongzuo = "跑";
    }

    public void run(){
        System.err.println("拖着四个轮子满街跑car·····");
    }
}