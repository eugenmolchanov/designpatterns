package com.yauhenmalchanau.education.patterns.behavioral.strategy;

import java.math.BigDecimal;

/**
 *  The strategy pattern allows us to change the behavior of an algorithm at runtime.
 */
public interface DiscounterStrategy {

    BigDecimal applyDiscount(BigDecimal price);
}
