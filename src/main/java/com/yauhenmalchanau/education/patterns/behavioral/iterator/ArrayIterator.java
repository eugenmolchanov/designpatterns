package com.yauhenmalchanau.education.patterns.behavioral.iterator;

public class ArrayIterator<T> implements EduIterator<T> {

    private T [] array;
    private int current = 0;

    public ArrayIterator(T [] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        int length = this.array.length;
        if (length == 0) {
            return false;
        }

        return this.current <= this.array.length - 1;
    }

    @Override
    public void first() {
        this.current = 0;
    }

    @Override
    public void next() {
        this.current++;
    }

    @Override
    public T currentItem() {
        if (!this.hasNext()) {
            throw new IndexOutOfBoundsException();
        }

        return this.array[current];
    }
}
