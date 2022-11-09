package com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.processor;

import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.AuthenticationProvider;

public abstract class AuthenticationProcessor {
  
  public final AuthenticationProcessor nextProcessor;

  public AuthenticationProcessor(
      AuthenticationProcessor nextProcessor) {
    this.nextProcessor = nextProcessor;
  }

  public abstract boolean isAuthorized(AuthenticationProvider authenticationProvider);

}
