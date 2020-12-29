package com.yauhenmalchanau.education.patterns.creational.singleton;

public class DraconianlySynchronizedClassSingleton {

    private static DraconianlySynchronizedClassSingleton INSTANCE;
    private String info = "Initial info class";

    private DraconianlySynchronizedClassSingleton() {

    }

    public synchronized static DraconianlySynchronizedClassSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DraconianlySynchronizedClassSingleton();
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }
}
