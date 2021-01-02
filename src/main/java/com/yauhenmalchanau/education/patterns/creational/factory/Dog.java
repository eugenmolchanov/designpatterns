package com.yauhenmalchanau.education.patterns.creational.factory;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Gav";
    }
}
