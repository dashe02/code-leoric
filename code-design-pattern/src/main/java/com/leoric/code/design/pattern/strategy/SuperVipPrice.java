package com.leoric.code.design.pattern.strategy;

/**
 * Created by wecash on 18/7/19.
 */
@PriceRegion(min = 2000, max = 3000)
public class SuperVipPrice implements CalPrice {
    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.8;
    }
}
