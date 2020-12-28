package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.common;

public class Bobruisk implements City {

    @Override
    public String name() {
        return "Bobruisk";
    }

    @Override
    public int population() {
        return 215_092;
    }

    @Override
    public double area() {
        return 83.86;
    }
}
