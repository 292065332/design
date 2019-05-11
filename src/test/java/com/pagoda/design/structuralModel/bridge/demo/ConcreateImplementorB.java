package com.pagoda.design.structuralModel.bridge.demo;

/**
 * 实现B
 */
public class ConcreateImplementorB implements Implementor {
    @Override
    public void operation() {
        System.out.println("this is concreteImplementorB's operation...");
    }
}