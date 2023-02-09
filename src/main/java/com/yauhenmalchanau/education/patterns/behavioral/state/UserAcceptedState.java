package com.yauhenmalchanau.education.patterns.behavioral.state;

public class UserAcceptedState implements UserAccountState {
    @Override
    public void nextState(UserAccount userAccount) {
        userAccount.setUserAccountState(new UserDismissedState());
    }

    @Override
    public void previousState(UserAccount userAccount) {
        userAccount.setUserAccountState(new UserInvitedState());
    }

    @Override
    public String currentState() {
        return "Accepted";
    }

    @Override
    public void executeSomeStateRelatedFunctionality() {
        // create all required resources for the user in the system
    }
}
