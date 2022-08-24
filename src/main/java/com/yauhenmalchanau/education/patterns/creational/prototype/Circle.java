package com.yauhenmalchanau.education.patterns.creational.prototype;

import java.util.Objects;

public class Circle extends Shape {

  private final int radius;

  public Circle(int x, int y, int radius) {
    super(x, y);
    this.radius = radius;
  }

  public Circle(Circle circle) {
    super(circle);
    this.radius = circle.radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Circle)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Circle circle = (Circle) o;
    return radius == circle.radius;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), radius);
  }
}
