package com.pagoda.design.behavioralModel.template.commont;

public class Test{
    public static void main(String[] args){
        //抽象类不可直接实例化对象，但可通过子类向上转型访问父类成员
        Drink drink1=new Coffee();
        //实例化对象调用prepare方法
        drink1.prepare();
        Drink drink2=new Tea();
        drink2.prepare();
    }
}