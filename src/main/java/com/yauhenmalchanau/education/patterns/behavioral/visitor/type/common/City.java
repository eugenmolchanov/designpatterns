package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.common;

public interface City {

    String name();

    int population();

    double area();

    default void accept(CityVisitor cityVisitor) {
        cityVisitor.visit(this);
    }
}
