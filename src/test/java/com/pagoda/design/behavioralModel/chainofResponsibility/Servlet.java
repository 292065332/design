package com.pagoda.design.behavioralModel.chainofResponsibility;


/**
 * servlet接口，仅实现service接口
 */
public interface Servlet {
    public void service(String request,String response);
}