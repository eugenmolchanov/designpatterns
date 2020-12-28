package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.custom;

public class Grodno implements TouristDestination {

    private String name = "Grodno";
    private int cityPopulation = 373_547;

    public String getName() {
        return name;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    @Override
    public void accept(TouristDestinationVisitor touristDestinationVisitor) {
        touristDestinationVisitor.visitGrodno(this);
    }
}
