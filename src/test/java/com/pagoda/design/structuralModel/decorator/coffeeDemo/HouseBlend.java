package com.pagoda.design.structuralModel.decorator.coffeeDemo;

/**
 * 具体装饰: 混合咖啡类
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return 4.9;
    }
}

