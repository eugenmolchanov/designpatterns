package com.yauhenmalchanau.education.patterns.behavioral.mediator;

import java.util.UUID;

public class SignUpService {

    private final SignUpMediator signUpMediator;

    public SignUpService(SignUpMediatorImpl signUpMediator) {
        this.signUpMediator = signUpMediator;
    }

    public void createUser(UserDto userDto) {
        this.signUpMediator.signUp(userDto);
    }

    public String signUp(UserDto userDto) {
        // sign up and return generated user id
        return UUID.randomUUID().toString();
    }
}
