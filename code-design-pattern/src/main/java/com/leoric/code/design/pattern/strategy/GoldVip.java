package com.leoric.code.design.pattern.strategy;

/**
 * Created by wecash on 18/7/19.
 */
@PriceRegion(min = 3000)
public class GoldVip implements CalPrice {

    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice * 0.7;
    }
}
