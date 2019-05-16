package com.pagoda.design.behavioralModel.chainofResponsibility;


/**
 * 过滤器接口
 */
public abstract class Filter {
    //request 和response在真正的servlet中是对象，此处简化处理为string
    public abstract void doFilter(String request,String response,FilterChain filterChain);
}