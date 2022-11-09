package com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.processor.AuthenticationProcessor;
import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.processor.OauthProcessor;
import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.processor.UsernamePasswordProcessor;
import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.AuthenticationProvider;
import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.OauthTokenProvider;
import com.yauhenmalchanau.education.patterns.behavioral.chainofresponsibility.provider.UsernamePasswordProvider;
import org.junit.Test;

public class ChainOfResponsibilityTest {

  private static AuthenticationProcessor getChainOfAuthProcessor() {
    AuthenticationProcessor oAuthProcessor = new OauthProcessor(null);
    return new UsernamePasswordProcessor(oAuthProcessor);
  }

  @Test
  public void shouldAuthorizeOauthToken() {
    AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
    assertTrue(authProcessorChain.isAuthorized(new OauthTokenProvider()));
  }

  @Test
  public void shouldAuthorizeByUserNameAndPassword() {
    AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
    assertTrue(authProcessorChain.isAuthorized(new UsernamePasswordProvider()));
  }

  @Test
  public void shouldNotAuthorizeSamlToken() {
    AuthenticationProcessor authProcessorChain = getChainOfAuthProcessor();
    assertFalse(authProcessorChain.isAuthorized(new SamlTokenProvider()));
  }

  private static class SamlTokenProvider extends AuthenticationProvider {

  }
}
