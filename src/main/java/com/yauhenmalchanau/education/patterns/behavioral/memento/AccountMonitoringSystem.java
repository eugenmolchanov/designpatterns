package com.yauhenmalchanau.education.patterns.behavioral.memento;

/**
 * As the Caretaker, it will hold the state of the Originator and ask to restore it when needed.
 * The Caretaker is the object triggering the save and restore of the state
 */
public class AccountMonitoringSystem {

    private final Account account;
    private AccountState savedAccountState;

    public AccountMonitoringSystem(Account account) {
        this.account = account;
    }

    public void save() {
        this.savedAccountState = this.account.save();
    }

    public void undo() {
        account.restore(savedAccountState);
    }
}
