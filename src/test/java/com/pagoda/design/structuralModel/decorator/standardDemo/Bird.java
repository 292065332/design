package com.pagoda.design.structuralModel.decorator.standardDemo;

/**
 * 具体装饰(ConcreteDecorator)角色：
 * 负责给构件对象“贴上”附加的责任。
 */
public class Bird extends Decorator {

    public Bird(Component component) {
        super(component);
    }

    @Override
    public void move() {
        System.out.println("实现鸟类的变换 ! ");
    }
}

