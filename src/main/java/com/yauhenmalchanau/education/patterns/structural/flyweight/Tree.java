package com.yauhenmalchanau.education.patterns.structural.flyweight;

public class Tree {
  
  private int height;
  private TreeType treeType;

  public Tree(int height, TreeType treeType) {
    this.height = height;
    this.treeType = treeType;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public TreeType getTreeType() {
    return treeType;
  }

  public void setTreeType(TreeType treeType) {
    this.treeType = treeType;
  }
}
