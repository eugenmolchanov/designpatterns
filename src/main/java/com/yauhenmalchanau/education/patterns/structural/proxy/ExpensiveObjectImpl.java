package com.yauhenmalchanau.education.patterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

  public ExpensiveObjectImpl() {
    System.out.println("Create expensive object");
    headyInitConfig();
  }

  @Override
  public void process() {
    System.out.println("Processing expensive object");
  }

  private void headyInitConfig() {
    System.out.println("Loading initial configuration ...");
  }
}
