package com.yauhenmalchanau.education.bridge.impl;

import com.yauhenmalchanau.education.bridge.Color;
import com.yauhenmalchanau.education.bridge.Shape;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
