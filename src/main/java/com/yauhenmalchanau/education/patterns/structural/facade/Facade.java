package com.yauhenmalchanau.education.patterns.structural.facade;

/**
 * Facade adds additional layer of abstraction. It hides much of the complexity and makes the
 * subsystem easy to use. If we need to use the complex subsystem directly, we still can do that.
 */
public class Facade {

  private final InternalComponent1 internalComponent1;
  private final InternalComponent2 internalComponent2;

  public Facade(
      InternalComponent1 internalComponent1,
      InternalComponent2 internalComponent2) {
    this.internalComponent1 = internalComponent1;
    this.internalComponent2 = internalComponent2;
  }

  public void executeLogicWithInternalComponents() {
    internalComponent2.executeSomething();
    internalComponent1.doSomething();
  }
}
