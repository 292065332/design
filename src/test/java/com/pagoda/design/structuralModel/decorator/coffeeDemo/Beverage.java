package com.pagoda.design.structuralModel.decorator.coffeeDemo;

/**
 * 超类 : 实现咖啡共有方法
 */
public abstract class Beverage {
    protected String description = "";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

