package com.yauhenmalchanau.education.patterns.creational.singleton;

/**
 * This approach has serialization and thread-safety guaranteed by the enum implementation itself, which ensures
 * internally that only the single instance is available, correcting the problems pointed out in the class-based
 * implementation.
 */
public enum EnumSingleton {

    INSTANCE("Initial info class");

    private String info;

    private EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
}
