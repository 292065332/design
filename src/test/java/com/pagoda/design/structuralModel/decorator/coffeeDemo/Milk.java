package com.pagoda.design.structuralModel.decorator.coffeeDemo;

/**
 * 具体修饰 : 牛奶类
 */
public class Milk extends CondimentDecorator {
    protected Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",with milk";
    }

    @Override
    public double cost() {
        return 2.3 + beverage.cost();
    }
}

