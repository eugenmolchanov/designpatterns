package com.yauhenmalchanau.education.patterns.creational.prototype;

import java.util.Objects;

public class Rectangle extends Shape {

  private final int width;
  private final int height;

  public Rectangle(int x, int y, int width, int height) {
    super(x, y);
    this.width = width;
    this.height = height;
  }

  public Rectangle(Rectangle rectangle) {
    super(rectangle);
    this.width = rectangle.width;
    this.height = rectangle.height;
  }

  @Override
  public Shape clone() {
    return new Rectangle(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Rectangle)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Rectangle rectangle = (Rectangle) o;
    return width == rectangle.width && height == rectangle.height;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), width, height);
  }
}
