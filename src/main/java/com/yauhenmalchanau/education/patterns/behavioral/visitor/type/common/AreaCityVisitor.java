package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.common;

public class AreaCityVisitor implements CityVisitor {

    private double area = 0;

    public double getArea() {
        return area;
    }

    @Override
    public void visit(City city) {
        this.area += city.area();
    }
}
