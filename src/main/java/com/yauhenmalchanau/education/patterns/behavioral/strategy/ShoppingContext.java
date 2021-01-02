package com.yauhenmalchanau.education.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class ShoppingContext {

    private DiscounterStrategy discounterStrategy;

    public ShoppingContext(DiscounterStrategy discounterStrategy) {
        this.discounterStrategy = discounterStrategy;
    }

    public String shop(BigDecimal budget, BigDecimal productPrice) {
        BigDecimal productPriceWithDiscount = discounterStrategy.applyDiscount(productPrice);
        if (budget.compareTo(productPriceWithDiscount) >= 0) {
            return "Bought.";
        }

        return "Not enough money.";
    }
}
