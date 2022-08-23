package com.yauhenmalchanau.education.patterns.structural.facade;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;

public class FacadePatternTest {

  @Test
  public void shouldExecute() {
    var internalComponent1Mock = Mockito.mock(InternalComponent1.class);
    var internalComponent2Mock = Mockito.mock(InternalComponent2.class);
    Facade facade = new Facade(internalComponent1Mock, internalComponent2Mock);

    facade.executeLogicWithInternalComponents();

    verify(internalComponent1Mock).doSomething();
    verify(internalComponent2Mock).executeSomething();
  }
}
