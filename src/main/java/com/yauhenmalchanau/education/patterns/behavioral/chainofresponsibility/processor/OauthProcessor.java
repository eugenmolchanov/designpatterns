package com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.processor;

import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.AuthenticationProvider;
import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.OauthTokenProvider;

public class OauthProcessor extends AuthenticationProcessor {
  
  public OauthProcessor(AuthenticationProcessor processor) {
    super(processor);
  }

  @Override
  public boolean isAuthorized(AuthenticationProvider authenticationProvider) {
    if (authenticationProvider instanceof OauthTokenProvider) {
      return true;
    }
    
    if (nextProcessor != null) {
      return nextProcessor.isAuthorized(authenticationProvider);
    }
    
    return false;
  }
}
