package com.yauhenmalchanau.education.patterns.structural.decorator;

/**
 * A Decorator pattern can be used to attach additional responsibilities to an object either statically or dynamically.
 */
public class TreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return this.christmasTree.decorate();
    }
}
