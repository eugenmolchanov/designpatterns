package com.yauhenmalchanau.education.patterns.structural.composite;

import org.junit.Test;

public class CompositePatternTest {

    @Test
    public void leafTest() {
        Department financialDepartment = new FinancialDepartment("Financial department");
        financialDepartment.printDepartmentName();
    }

    @Test
    public void compositeTest() {
        Department financialDepartment = new FinancialDepartment("Financial department");
        HeadDepartment headDepartment = new HeadDepartment("Head department");
        headDepartment.addDepartment(financialDepartment);
        headDepartment.printDepartmentName();
    }
}
