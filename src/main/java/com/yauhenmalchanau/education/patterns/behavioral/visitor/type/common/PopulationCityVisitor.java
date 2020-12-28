package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.common;

public class PopulationCityVisitor implements CityVisitor {

    private int totalPopulation = 0;

    public int getTotalPopulation() {
        return totalPopulation;
    }

    @Override
    public void visit(City city) {
        this.totalPopulation += city.population();
    }
}
