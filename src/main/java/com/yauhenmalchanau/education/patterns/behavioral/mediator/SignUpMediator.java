package com.yauhenmalchanau.education.patterns.behavioral.mediator;

/**
 * The intent of the Mediator Pattern is to reduce the complexity and dependencies between tightly coupled objects
 * communicating directly with one another. This is achieved by creating a mediator object that takes care of the
 * interaction between dependent objects. Consequently, all the communication goes through the mediator.
 */
public interface SignUpMediator {

    void signUp(UserDto userDto);

    void addSignUpEventListeners(SignUpEventListener listener);

    void notifyListeners(String userId);
}
