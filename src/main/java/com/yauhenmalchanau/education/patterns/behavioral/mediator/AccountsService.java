package com.yauhenmalchanau.education.patterns.behavioral.mediator;

public class AccountsService {

    private final SignUpMediator signUpMediator;

    public AccountsService(SignUpMediatorImpl signUpMediator) {
        this.signUpMediator = signUpMediator;
    }

    void createAccount(String userId) {
        // create account
        signUpMediator.notifyListeners(userId);
    }
}
