package com.yauhenmalchanau.education.patterns.creational.singleton;

/**
 * Even though the double-checked locking can potentially speed things up, it has at least two issues:
 *
 *     since it requires the volatile keyword to work properly, it's not compatible with Java 1.4 and lower versions
 *     it's quite verbose and it makes the code difficult to read
 */
public class DoubleCheckedLockingClassSingleton {

    private static volatile DoubleCheckedLockingClassSingleton INSTANCE;
    private String info = "Initial info class";

    private DoubleCheckedLockingClassSingleton() {

    }

    public static DoubleCheckedLockingClassSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLockingClassSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLockingClassSingleton();
                }
            }
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }
}
