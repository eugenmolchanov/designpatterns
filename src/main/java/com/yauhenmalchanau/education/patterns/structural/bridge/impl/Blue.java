package com.yauhenmalchanau.education.patterns.structural.bridge.impl;

import com.yauhenmalchanau.education.patterns.structural.bridge.Color;

public class Blue implements Color {

    @Override
    public String fill() {
        return "Color is Blue.";
    }
}
