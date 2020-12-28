package com.yauhenmalchanau.education.patterns.structural.composite;

/**
 * Leaf – implements the default behavior of the base component. It doesn't contain a reference to the other objects.
 */
public class FinancialDepartment implements Department {

    private String name;

    public FinancialDepartment(String name) {
        this.name = name;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this.name);
    }
}
