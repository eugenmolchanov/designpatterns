package com.yauhenmalchanau.education.patterns.structural.flyweight;

public class TreeType {
  
  private final String name;
  private final String color;

  public TreeType(String name, String color) {
    this.name = name;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }
}
