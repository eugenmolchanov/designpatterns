package com.yauhenmalchanau.education.patterns.behavioral.iterator;

public interface Aggregate<T> {

    EduIterator<T> iterator();
}
