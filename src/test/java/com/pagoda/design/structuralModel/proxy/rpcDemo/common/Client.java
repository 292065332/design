package com.pagoda.design.structuralModel.proxy.rpcDemo.common;

public class Client {

    public static void main(String[] args) {
        HelloService service = new Server.HelloServiceImpl();
        service.sayHello("直接调用");
    }
}