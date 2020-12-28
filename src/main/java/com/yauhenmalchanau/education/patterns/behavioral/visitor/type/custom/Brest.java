package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.custom;

public class Brest implements TouristDestination {

    private String name = "Brest";
    private int population = 350_616;

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public void accept(TouristDestinationVisitor touristDestinationVisitor) {
        touristDestinationVisitor.visitBrest(this);
    }
}
