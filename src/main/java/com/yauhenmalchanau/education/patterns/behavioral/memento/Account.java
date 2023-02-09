package com.yauhenmalchanau.education.patterns.behavioral.memento;

import java.math.BigDecimal;

/**
 * Originator is the object whose state needs to be saved.
 */
public class Account {

    private final String id;
    private BigDecimal amount;

    public AccountState save() {
        return new AccountState(this);
    }

    public Account(String id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public void increaseBalance(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

    public void restore(AccountState accountState) {
        this.amount = accountState.getAmount();
    }

    public String getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
