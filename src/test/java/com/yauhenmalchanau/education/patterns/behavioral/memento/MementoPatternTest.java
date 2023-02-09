package com.yauhenmalchanau.education.patterns.behavioral.memento;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MementoPatternTest {

    @Test
    public void shouldTestMemento() {
        var account = new Account("1", BigDecimal.TEN);
        var accountMonitoringSystem = new AccountMonitoringSystem(account);

        assertAccount(account, BigDecimal.TEN);

        accountMonitoringSystem.save();

        account.increaseBalance(BigDecimal.ONE);

        assertAccount(account, new BigDecimal(11));

        accountMonitoringSystem.undo();

        assertAccount(account, BigDecimal.TEN);
    }

    private void assertAccount(Account account, BigDecimal expectedBalance) {
        assertEquals(expectedBalance, account.getAmount());
        assertEquals("1", account.getId());
    }
}
