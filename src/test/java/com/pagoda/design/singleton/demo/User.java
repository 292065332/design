package com.pagoda.design.singleton.demo;

/**
 * 枚举类型 -单例
 */
public enum User {
    /**
     * 单例
     */
    Instance;

    private User() {
        System.out.println("初始化User");
    }

    public void print() {
        System.out.println("tttttt");
    }
}