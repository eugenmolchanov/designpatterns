package com.yauhenmalchanau.education.patterns.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorPatternTest {

    @Test
    public void test() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(),
                "Christmas tree with Garland");

        ChristmasTree tree2 = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(),
                "Christmas tree with Garland with Garland with Bubble Lights");
    }
}
