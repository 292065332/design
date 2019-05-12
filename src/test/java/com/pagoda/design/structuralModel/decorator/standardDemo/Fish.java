package com.pagoda.design.structuralModel.decorator.standardDemo;

/**
 * 具体装饰(ConcreteDecorator)角色：
 * 负责给构件对象“贴上”附加的责任。
 */
public class Fish extends Decorator {

    public Fish(Component component) {
        super(component);
    }

    @Override
    public void move() {
        System.out.println("实现鱼类的变换 ! ");
    }
}
