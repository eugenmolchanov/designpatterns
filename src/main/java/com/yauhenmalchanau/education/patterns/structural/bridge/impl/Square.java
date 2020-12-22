package com.yauhenmalchanau.education.patterns.structural.bridge.impl;

import com.yauhenmalchanau.education.patterns.structural.bridge.Color;
import com.yauhenmalchanau.education.patterns.structural.bridge.Shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
