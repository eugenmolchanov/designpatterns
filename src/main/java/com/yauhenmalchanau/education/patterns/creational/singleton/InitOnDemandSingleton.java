package com.yauhenmalchanau.education.patterns.creational.singleton;

/**
 * As class initialization occurs the first time we use one of its methods or fields, we can use a nested static class
 * to implement lazy initialization.
 */
public class InitOnDemandSingleton {

    private static class InstanceHolder {
        private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
    }

    public static InitOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
