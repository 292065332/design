package com.pagoda.design.structuralModel.bridge;

/**
 * 定义 桥接类子类
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    protected void operation() {
        super.getImplementor().operation();
    }
}