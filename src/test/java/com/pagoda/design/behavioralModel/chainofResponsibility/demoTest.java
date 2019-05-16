package com.pagoda.design.behavioralModel.chainofResponsibility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 责任链模式
 * 在工作中，尤其是java web开发中，有两个地方明显使用责任链模式，
 * 一个是filter，一个是listener，filter的自定义在web开发中可以对web请求做各种处理和过滤，
 * 包括：对请求和相应的字符集处理、对跨站脚本攻击的过滤、 获取客户端真实ip地址、获取客户证书、防止盗链等等，
 * 在此处，简单模拟责任链模式对请求的处理。
 */
public class demoTest {

    public static void main(String[] args) {
        //定义filter
        Filter encodeFilter=new EncodeFilter();
        Filter xssFilter=new XssFilter();
        FilterChain chain=new FilterChain();
        chain.addFilter(encodeFilter);
        chain.addFilter(xssFilter);

        //定义servlet
        Servlet servlet=new MainServlet();
        chain.setServlet(servlet);
        chain.doFilter("发送请求", "");
    }

}
