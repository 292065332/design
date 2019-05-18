package com.pagoda.design.behavioralModel.template.commont;

class Tea extends Drink{
    //父类中的抽象类在子类中具体实现
    public void brew(){
        System.out.println("2.泡茶");
    }
    public void add(){
        System.out.println("4.加柠檬");
    }
}