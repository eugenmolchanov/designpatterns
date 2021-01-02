package com.yauhenmalchanau.education.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class ChristmasDiscounter implements DiscounterStrategy {

    @Override
    public BigDecimal applyDiscount(BigDecimal price) {
        return price.multiply(BigDecimal.valueOf(0.9));
    }
}
