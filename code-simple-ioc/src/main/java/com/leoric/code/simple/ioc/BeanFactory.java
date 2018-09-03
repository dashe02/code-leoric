package com.leoric.code.simple.ioc;

/**
 * Created by wecash on 18/8/20.
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;

    void registerBeanDefinition(String name, BeanDefinition bean) throws Exception;
}
