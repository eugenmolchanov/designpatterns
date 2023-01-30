package com.yauhenmalchanau.education.patterns.behavioral.observer;

/**
 * An observable is an object which notifies observers about the changes in its state.
 */
public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);
}
