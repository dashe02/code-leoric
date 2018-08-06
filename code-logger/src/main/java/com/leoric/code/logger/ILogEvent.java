package com.leoric.code.logger;

/**
 * Created by wecash on 18/8/2.
 */
public interface ILogEvent<T, F> {

    F doEvent(T t);
}
