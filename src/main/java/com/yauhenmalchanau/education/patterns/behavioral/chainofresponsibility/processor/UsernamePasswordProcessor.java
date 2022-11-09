package com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.processor;

import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.AuthenticationProvider;
import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.UsernamePasswordProvider;

public class UsernamePasswordProcessor extends AuthenticationProcessor {

  public UsernamePasswordProcessor(
      AuthenticationProcessor nextProcessor) {
    super(nextProcessor);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
    if (authenticationProvider instanceof UsernamePasswordProvider) {
      return true;
    }
    
    if (nextProcessor != null) {
      return nextProcessor.isAuthorized(authenticationProvider);
    }
    
    return false;
  }
}
