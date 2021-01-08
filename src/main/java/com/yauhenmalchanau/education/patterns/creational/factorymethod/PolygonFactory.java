package com.yauhenmalchanau.education.patterns.creational.factorymethod;

import java.util.Optional;

/**
 * Defines an interface for creating an object, but let subclasses decide which class to instantiate.
 * The Factory method lets a class defer instantiation to subclasses
 */
public class PolygonFactory {

    public Optional<Polygon> getPolygon(int numberOfSides) {
        switch (numberOfSides) {
            case 3:
                return Optional.of(new Triangle());
            case 4:
                return Optional.of(new Square());
            case 5:
                return Optional.of(new Pentagon());
            default:
                return Optional.empty();
        }
    }
}
