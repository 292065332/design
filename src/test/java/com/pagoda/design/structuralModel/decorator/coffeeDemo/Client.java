package com.pagoda.design.structuralModel.decorator.coffeeDemo;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Mocha(new Milk(new Mocha(new HouseBlend())));
        //如上就是一杯HouseBlend配上两份Mocha和一份Milk，没去星巴克喝过咖啡,这样配可以么= =
        System.out.println(beverage.getDescription() + ":" + beverage.cost());
    }
}

