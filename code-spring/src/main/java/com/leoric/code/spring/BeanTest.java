package com.leoric.code.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by wecash on 18/8/17.
 */
public class BeanTest implements BeanPostProcessor{

    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return null;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return null;
    }
}
