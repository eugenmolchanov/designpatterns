package com.yauhenmalchanau.education.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite – has leaf elements. It implements the base component methods and defines the child-related operations.
 */
public class HeadDepartment implements Department {

    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(String name) {
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        System.out.println(this.name);
        System.out.println("--------------------");
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }
}
