package com.yauhenmalchanau.education.patterns.behavioral.strategy;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class StrategyPatternTest {

    @Test
    public void newYearDiscountBoughtTest() {
        ShoppingContext shoppingContext = new ShoppingContext(new NewYearDiscounter());
        String result = shoppingContext.shop(new BigDecimal(100), new BigDecimal(105));
        Assert.assertEquals("Bought.", result);
    }

    @Test
    public void newYearDiscountNoMoneyTest() {
        ShoppingContext shoppingContext = new ShoppingContext(new NewYearDiscounter());
        String result = shoppingContext.shop(new BigDecimal(100), new BigDecimal(100).multiply(BigDecimal.valueOf(1.2).add(BigDecimal.ONE)));
        Assert.assertEquals("Not enough money.", result);
    }
}
