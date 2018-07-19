package com.leoric.code.design.pattern.strategy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wecash on 18/7/19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PriceRegion {

    int max() default Integer.MAX_VALUE;

    int min() default Integer.MIN_VALUE;
}
