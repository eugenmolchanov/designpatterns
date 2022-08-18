package com.yauhenmalchanau.education.patterns.structural.flyweight;

import java.util.List;

public class Forest {

  public Forest(List<Tree> trees) {
    this.trees = trees;
  }

  private final List<Tree> trees;

  public void plantTree(int height, String name, String color) {
    TreeType type = TreeTypeFactory.getTreeType(name, color);
    Tree tree = new Tree(height, type);
    trees.add(tree);
  }

  public List<Tree> getTrees() {
    return trees;
  }
}
