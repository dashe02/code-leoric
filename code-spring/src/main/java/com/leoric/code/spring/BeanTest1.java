package com.leoric.code.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * Created by wecash on 18/8/17.
 */
public class BeanTest1 implements BeanFactoryAware{

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}
