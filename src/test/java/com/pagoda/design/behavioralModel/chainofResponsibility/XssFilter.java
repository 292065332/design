package com.pagoda.design.behavioralModel.chainofResponsibility;


/**
 * 过滤器-处理xss攻击
 */
public class XssFilter extends Filter {

    @Override
    public void doFilter(String request, String response, FilterChain filterChain) {
        System.out.println("过滤request的xss内容");
        filterChain.doFilter(request, response);
        System.out.println("过滤response的xss内容");
    }

}