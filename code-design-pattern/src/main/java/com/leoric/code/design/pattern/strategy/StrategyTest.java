package com.leoric.code.design.pattern.strategy;

/**
 * Created by wecash on 18/7/19.
 */
public class StrategyTest {

    public static void main(String[] args) {

        Player player = new Player();
        player.buy(5000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());
        player.buy(12000D);
        System.out.println("玩家需要付钱：" + player.calLastAmount());

    }
}
