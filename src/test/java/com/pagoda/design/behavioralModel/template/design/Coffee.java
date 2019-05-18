package com.pagoda.design.behavioralModel.template.design;

class Coffee extends Drink{
    public void prepare(){
        boilWater();
        brewCoffee();
        dropIntoCup();
        addSugerAndMilk();
    }
    public void brewCoffee(){
        System.out.println("2.泡咖啡");
    }
    public void addSugerAndMilk(){
        System.out.println("4.加牛奶或糖");
    }
}