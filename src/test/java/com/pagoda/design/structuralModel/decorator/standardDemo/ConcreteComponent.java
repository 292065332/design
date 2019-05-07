package com.pagoda.design.structuralModel.decorator.standardDemo;

/**
 * 具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类(相当于孙悟空本体)
 */
public class ConcreteComponent implements Component {

    /**
     * 这是孙悟空本体
     */
    @Override
    public void move() {
        System.out.println("孙大圣本体 ! ");
    }
}