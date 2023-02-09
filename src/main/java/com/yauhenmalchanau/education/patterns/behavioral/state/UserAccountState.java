package com.yauhenmalchanau.education.patterns.behavioral.state;

/**
 * State pattern allows the object for changing its behavior without changing its class.
 * State pattern drawback is the payoff when implementing transition between the states. That makes the state hardcoded,
 * which is a bad practice in general.
 */
public interface UserAccountState {

    void nextState(UserAccount userAccount);

    void previousState(UserAccount userAccount);

    String currentState();

    void executeSomeStateRelatedFunctionality();
}
