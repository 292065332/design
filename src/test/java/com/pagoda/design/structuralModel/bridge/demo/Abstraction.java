package com.pagoda.design.structuralModel.bridge.demo;

import com.pagoda.design.structuralModel.bridge.demo.Implementor;

/**
 * 定义桥接类Abstraction，其中有对Implementor接口的引用
 */
public abstract class Abstraction {
    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    protected void operation() {
        implementor.operation();
    }
}