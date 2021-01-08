package com.yauhenmalchanau.education.patterns.creational.abstractfactory;

import java.util.Optional;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Optional<Color> create(String type) {
        if ("White".equalsIgnoreCase(type)) {
            return Optional.of(new WhiteColor());
        }

        if ("Brown".equalsIgnoreCase(type)) {
            return Optional.of(new BrownColor());
        }

        return Optional.empty();
    }
}
