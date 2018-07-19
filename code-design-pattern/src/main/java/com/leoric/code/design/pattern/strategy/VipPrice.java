package com.leoric.code.design.pattern.strategy;

/**
 * Created by wecash on 18/7/19.
 */
@PriceRegion(max = 2000)
public class VipPrice implements CalPrice {

    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.9;
    }
}
