package com.pagoda.design.behavioralModel.template.design;

class Tea extends Drink{
    public void prepare(){
        boilWater();
        brewTea();
        dropIntoCup();
        addLemon();
    }
    public void brewTea(){
        System.out.println("2.泡茶");
    }
    public void addLemon(){
        System.out.println("4.加柠檬");
    }
}