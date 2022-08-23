package com.yauhenmalchanau.education.patterns.structural.proxy;

/**
 * Proxy can be used when we want a simplified version of a complex or heavy object; when we want to
 * add a layer of security to the original underlying object to provide controlled access based on
 * access rights of the client.
 */
public class ExpensiveObjectProxy implements ExpensiveObject {

  private static ExpensiveObject expensiveObject;

  @Override
  public void process() {
    if (expensiveObject == null) {
      expensiveObject = new ExpensiveObjectImpl();
    }

    // here we can also log the request details for the target object
    // and restrict the access based on some condition
    expensiveObject.process();
  }
}
