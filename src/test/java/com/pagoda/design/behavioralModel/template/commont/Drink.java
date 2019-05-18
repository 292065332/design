package com.pagoda.design.behavioralModel.template.commont;

abstract class Drink{//抽象父类
    public void prepare(){
        boilWater();
        brew();
        dropIntoCup();
        add();
    }
    //净水煮沸与倒入杯中实则一样
    public void boilWater(){
        System.out.println("1.煮沸水");
    }
    public void dropIntoCup(){
        System.out.println("3.将饮料倒入杯中");
    }
    //抽象类
    public abstract void brew();
    public abstract void add();
}