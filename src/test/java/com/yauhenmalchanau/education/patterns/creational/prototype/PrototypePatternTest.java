package com.yauhenmalchanau.education.patterns.creational.prototype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class PrototypePatternTest {
  
  @Test
  public void shouldTestPrototypePattern() {
    List<Shape> shapes = new ArrayList<>();
    List<Shape> shapesCopy = new ArrayList<>();

    Circle circle = new Circle(10, 20, 15);
    shapes.add(circle);

    Circle anotherCircle = (Circle) circle.clone();
    shapes.add(anotherCircle);

    Rectangle rectangle = new Rectangle(10, 20, 10, 20);
    shapes.add(rectangle);

    for (Shape shape : shapes) {
      shapesCopy.add(shape.clone());
    }

    for (int i = 0; i < shapes.size(); i++) {
      var obj = shapes.get(i);
      var objCopy = shapesCopy.get(i);
      assertNotSame(obj, objCopy);
      assertEquals(obj, objCopy);
    }
  }

}
