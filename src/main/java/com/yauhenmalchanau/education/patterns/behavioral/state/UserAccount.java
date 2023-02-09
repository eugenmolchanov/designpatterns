package com.yauhenmalchanau.education.patterns.behavioral.state;

public class UserAccount {

    private UserAccountState userAccountState = new UserInvitedState();

    public void setUserAccountState(UserAccountState userAccountState) {
        this.userAccountState = userAccountState;
    }

    public void nextState() {
        this.userAccountState.nextState(this);
    }

    public void previousState() {
        this.userAccountState.previousState(this);
    }

    public String currentState() {
        return this.userAccountState.currentState();
    }

    public void executeRequiredFunctionality() {
        userAccountState.executeSomeStateRelatedFunctionality();
    }
}
