package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.custom;

public class CustomPopulationCityVisitorImpl implements TouristDestinationVisitor {

    private int population = 0;

    public int getPopulation() {
        return population;
    }

    @Override
    public void visitBrest(Brest brest) {
        this.population += brest.getPopulation();
    }

    @Override
    public void visitGrodno(Grodno grodno) {
        this.population += grodno.getCityPopulation();
    }
}
