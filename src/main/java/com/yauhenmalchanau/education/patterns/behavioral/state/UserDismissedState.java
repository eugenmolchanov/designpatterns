package com.yauhenmalchanau.education.patterns.behavioral.state;

public class UserDismissedState implements UserAccountState {
    @Override
    public void nextState(UserAccount userAccount) {
        System.out.println("Final state of the user");
    }

    @Override
    public void previousState(UserAccount userAccount) {
        userAccount.setUserAccountState(new UserAcceptedState());
    }

    @Override
    public String currentState() {
        return "Dismissed";
    }

    @Override
    public void executeSomeStateRelatedFunctionality() {
        // delete all the resources associated with the user in the system
    }
}
