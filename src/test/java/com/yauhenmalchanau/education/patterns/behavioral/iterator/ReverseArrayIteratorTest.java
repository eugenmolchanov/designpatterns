package com.yauhenmalchanau.education.patterns.behavioral.iterator;

import org.junit.Test;

public class ReverseArrayIteratorTest {

    @Test
    public void namesArrayTest() {
        String [] names = {"Minsk", "Grodno", "Brest", "Vitebsk", "Mogilev", "Gomel"};

        EduIterator<String> namesIterator = new ReverseArrayIterator<>(names);

        for (namesIterator.first(); namesIterator.hasNext(); namesIterator.next()) {
            System.out.println(namesIterator.currentItem());
        }
    }

    @Test
    public void numbersArrayTest() {
        Integer [] numbers = {1, 2, 3, 4, 5, 6, 7};

        EduIterator<Integer> numbersIterator = new ReverseArrayIterator<>(numbers);

        for (numbersIterator.first(); numbersIterator.hasNext(); numbersIterator.next()) {
            System.out.println(numbersIterator.currentItem());
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void numbersOutTest() {
        Integer [] numbers = {1, 2, 3, 4, 5, 6, 7};

        EduIterator<Integer> numbersIterator = new ReverseArrayIterator<>(numbers);

        for (numbersIterator.first(); numbersIterator.hasNext(); numbersIterator.next()) {
            System.out.println(numbersIterator.currentItem());
        }

        numbersIterator.currentItem();
    }
}
