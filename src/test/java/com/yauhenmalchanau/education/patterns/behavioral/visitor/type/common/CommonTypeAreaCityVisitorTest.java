package com.yauhenmalchanau.education.patterns.behavioral.visitor.type.common;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommonTypeAreaCityVisitorTest {

    @Test
    public void areaCityVisitorTest() {
        List<City> cities = Arrays.asList(
                new Minsk()
        );

        AreaCityVisitor areaCityVisitor = new AreaCityVisitor();
        for (City city : cities) {
            city.accept(areaCityVisitor);
        }

        Assert.assertEquals(0, Double.compare(new Minsk().area(), areaCityVisitor.getArea()));
    }

    @Test
    public void areaCityVisitorTwoCitiesTest() {
        List<City> cities = Arrays.asList(
                new Minsk(),
                new Bobruisk()
        );

        AreaCityVisitor areaCityVisitor = new AreaCityVisitor();
        for (City city : cities) {
            city.accept(areaCityVisitor);
        }

        Assert.assertEquals(0, Double.compare(new Minsk().area() + new Bobruisk().area(), areaCityVisitor.getArea()));
    }
}
