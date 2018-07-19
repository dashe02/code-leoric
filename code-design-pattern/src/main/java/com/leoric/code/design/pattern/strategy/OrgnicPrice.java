package com.leoric.code.design.pattern.strategy;

/**
 * Created by wecash on 18/7/19.
 */
@PriceRegion(max = 1000)
public class OrgnicPrice implements CalPrice{

    public Double calPrice(Double orgnicPrice) {
        return orgnicPrice;
    }
}
