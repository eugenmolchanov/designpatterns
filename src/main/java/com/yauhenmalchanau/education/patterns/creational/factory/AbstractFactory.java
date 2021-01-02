package com.yauhenmalchanau.education.patterns.creational.factory;

import java.util.Optional;

/**
 * Provides an interface for creating families of related or dependent objects without specifying their concrete classes
 * @param <T>
 */
public interface AbstractFactory<T> {

    Optional<T> create(String type);
}
