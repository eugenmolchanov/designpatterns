package com.yauhenmalchanau.education.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * This pattern is used to reduce the memory footprint. It can also improve performance in
 * applications where object instantiation is expensive.
 * <p>
 * Flyweight can be recognized by a creation method that returns cached objects instead of creating
 * new. Examples of Flyweight in core Java libraries: java.lang.Integer#valueOf(int) (also Boolean,
 * Byte, Character, Short, Long and BigDecimal)
 */
public class TreeTypeFactory {

  private static final Map<String, TreeType> treeTypes = new HashMap<>();

  public static TreeType getTreeType(String name, String color) {
    return treeTypes.computeIfAbsent(name, (nam) -> new TreeType(nam, color));
  }

  public static int getTreeTypesSize() {
    return treeTypes.size();
  }

}
