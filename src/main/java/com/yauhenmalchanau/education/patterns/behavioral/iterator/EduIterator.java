package com.yauhenmalchanau.education.patterns.behavioral.iterator;

public interface EduIterator<T> {

    boolean hasNext();

    void first();

    void next();

    T currentItem();
}
