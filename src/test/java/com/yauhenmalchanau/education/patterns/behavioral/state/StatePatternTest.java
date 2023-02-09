package com.yauhenmalchanau.education.patterns.behavioral.state;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StatePatternTest {

    @Test
    public void shouldTestStatePattern() {
        var userAccount = new UserAccount();
        userAccount.previousState();
        assertEquals("Invited", userAccount.currentState());

        userAccount.nextState();

        assertEquals("Accepted", userAccount.currentState());

        userAccount.nextState();

        assertEquals("Dismissed", userAccount.currentState());
        userAccount.nextState();
    }
}
