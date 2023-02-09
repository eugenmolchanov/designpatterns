package com.yauhenmalchanau.education.patterns.behavioral.memento;

import java.math.BigDecimal;

/**
 * The Memento Design Pattern offers a solution to implement undoable actions. If the state of the Originator is heavy,
 * using the Memento Design Pattern can lead to an expensive creation process and increased use of memory.
 */
public class AccountState {

    private final BigDecimal amount;

    public AccountState(Account account) {
        this.amount = account.getAmount();
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
