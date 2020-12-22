package com.yauhenmalchanau.education.patterns.structural.bridge;

import com.yauhenmalchanau.education.patterns.structural.bridge.impl.Red;
import com.yauhenmalchanau.education.patterns.structural.bridge.impl.Square;
import org.junit.Assert;
import org.junit.Test;

public class BridgePatternTest {

    @Test
    public void test() {
        Square square = new Square(new Red());

        Assert.assertEquals("Square drawn. Color is Red.", square.draw());
    }
}
