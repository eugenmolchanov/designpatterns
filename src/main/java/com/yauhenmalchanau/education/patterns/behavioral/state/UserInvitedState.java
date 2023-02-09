package com.yauhenmalchanau.education.patterns.behavioral.state;

public class UserInvitedState implements UserAccountState {
    @Override
    public void nextState(UserAccount userAccount) {
        userAccount.setUserAccountState(new UserAcceptedState());
    }

    @Override
    public void previousState(UserAccount userAccount) {
        System.out.println("Initial state of the user");
    }

    @Override
    public String currentState() {
        return "Invited";
    }

    @Override
    public void executeSomeStateRelatedFunctionality() {
        // send the invitation message
    }
}
