package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.common;

public class Minsk implements City {

    @Override
    public String name() {
        return "Minsk";
    }

    @Override
    public int population() {
        return 2_020_600;
    }

    @Override
    public double area() {
        return 409.5;
    }


}
