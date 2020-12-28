package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.custom;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CustomTypePopulationCityVisitorTest {

    @Test
    public void populationCityVisitorTest() {
        List<TouristDestination> touristDestinations = Arrays.asList(
                new Brest()
        );

        CustomPopulationCityVisitorImpl populationCityVisitor = new CustomPopulationCityVisitorImpl();
        for (TouristDestination touristDestination : touristDestinations) {
            touristDestination.accept(populationCityVisitor);
        }

        Assert.assertEquals(0, Double.compare(new Brest().getPopulation(), populationCityVisitor.getPopulation()));
    }

    @Test
    public void areaCityVisitorTwoCitiesTest() {
        List<TouristDestination> touristDestinations = Arrays.asList(
                new Brest(),
                new Grodno()
        );

        CustomPopulationCityVisitorImpl populationCityVisitor = new CustomPopulationCityVisitorImpl();
        for (TouristDestination touristDestination : touristDestinations) {
            touristDestination.accept(populationCityVisitor);
        }

        Assert.assertEquals(0, Double.compare(new Brest().getPopulation() + new Grodno().getCityPopulation(), populationCityVisitor.getPopulation()));
    }
}
