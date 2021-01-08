package com.yauhenmalchanau.education.patterns.creational.abstractfactory;

import java.util.Optional;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Optional<Animal> create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return Optional.of(new Dog());
        } else if ("Duck".equalsIgnoreCase(type)) {
            return Optional.of(new Duck());
        }

        return Optional.empty();
    }
}
