package com.yauhenmalchanau.education.patterns.behavioral.iterator;

public class ReverseArrayIterator<T> implements EduIterator<T> {

    private T [] array;
    private int current = 0;

    public ReverseArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return this.current >= 0;
    }

    @Override
    public void first() {
        this.current = this.array.length - 1;
    }

    @Override
    public void next() {
        this.current--;
    }

    @Override
    public T currentItem() {
        if (!this.hasNext()) {
            throw new IndexOutOfBoundsException();
        }

        return this.array[current];
    }
}
