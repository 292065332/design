package com.pagoda.design.creationModel.factory.springBeanFactory;

/**
 * 建立一个BeanFactory接口
 */
public interface BeanFactory {
     Object getBean(String id);
 }