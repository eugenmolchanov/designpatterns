package com.yauhenmalchanau.education.patterns.creational.prototype;

import java.util.Objects;

/**
 * Prototype pattern lets you copy existing objects without making your code dependent on their
 * classes. The Prototype pattern delegates the cloning process to the actual objects that are being
 * cloned. The pattern declares a common interface for all objects that support cloning. An object
 * that supports cloning is called a prototype.
 */
public abstract class Shape {

  private final int x;
  private final int y;

  public Shape(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Shape(Shape target) {
    this.x = target.x;
    this.y = target.y;
  }

  public abstract Shape clone();

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Shape)) {
      return false;
    }
    Shape shape = (Shape) o;
    return x == shape.x && y == shape.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
