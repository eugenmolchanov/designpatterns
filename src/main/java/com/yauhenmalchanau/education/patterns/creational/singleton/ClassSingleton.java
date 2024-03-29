package com.yauhenmalchanau.education.patterns.creational.singleton;

public class ClassSingleton {

    private static ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {

    }

    public static ClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }
}
