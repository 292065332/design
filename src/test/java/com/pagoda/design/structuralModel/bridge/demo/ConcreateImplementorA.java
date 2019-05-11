package com.pagoda.design.structuralModel.bridge.demo;

/**
 * 实现A
 */
public class ConcreateImplementorA implements Implementor {
    @Override
    public void operation() {
        System.out.println("this is concreteImplementorA's operation...");
    }
}