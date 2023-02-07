package com.yauhenmalchanau.education.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SignUpMediatorImpl implements SignUpMediator {

    private final List<SignUpEventListener> listeners;

    private SignUpService signUpService;
    private AccountsService accountsService;

    public SignUpMediatorImpl() {
        this.listeners = new ArrayList<>();
    }

    @Override
    public void signUp(UserDto userDto) {
        var userId = signUpService.signUp(userDto);
        accountsService.createAccount(userId);
    }

    @Override
    public void addSignUpEventListeners(SignUpEventListener listener) {
        this.listeners.add(listener);
    }

    @Override
    public void notifyListeners(String userId) {
        listeners.forEach(signUpEventListener -> signUpEventListener.notify(userId));
    }
}
