package com.pagoda.design.structuralModel.decorator.coffeeDemo;

/**
 * 摩卡类
 */
public class Mocha extends CondimentDecorator {
    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",with Mocha";
    }

    @Override
    public double cost() {
        return 1.2 + beverage.cost();
    }
}