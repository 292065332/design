package com.pagoda.design.behavioralModel.template.design;

//抽象出父类，将相同的操作放置与父类实现，子类继承即可
class Drink{
    public void prepare(){
        boilWater();
        dropIntoCup();
    }
    public void boilWater(){
        System.out.println("1.煮沸水");
    }
    public void dropIntoCup(){
        System.out.println("3.将饮料倒入杯中");
    }
}