package com.yauhenmalchanau.education.patterns.structural.flyweight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.LinkedList;
import org.junit.Test;

public class FlyweightPatternTest {
  
  @Test
  public void shouldCreateTypesOnlyOnce() {
    Forest forest = new Forest(new LinkedList<>());
    int count = 1000;
    for (int i = 0; i < 1000; i++) {
      forest.plantTree(i, i % 2 == 0 ? "oak" : "pine", "Green");
    }

    assertEquals(count, forest.getTrees().size());
    assertEquals(2, TreeTypeFactory.getTreeTypesSize());
  }
  
  @Test
  public void shouldReuseCreatedType() {
    TreeType type1 = TreeTypeFactory.getTreeType("oak", "green");
    TreeType type2 = TreeTypeFactory.getTreeType("oak", "green");
    
    assertSame(type1, type2);
  }

}
