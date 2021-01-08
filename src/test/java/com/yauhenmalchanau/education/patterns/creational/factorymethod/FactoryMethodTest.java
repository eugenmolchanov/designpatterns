package com.yauhenmalchanau.education.patterns.creational.factorymethod;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FactoryMethodTest {

    @Test
    public void triangleTest() {
        PolygonFactory factory = new PolygonFactory();

        Optional<Polygon> triangle = factory.getPolygon(3);
        assertTrue(triangle.isPresent());
        assertTrue(triangle.get() instanceof Triangle);
    }

    @Test
    public void squareTest() {
        PolygonFactory factory = new PolygonFactory();

        Optional<Polygon> square = factory.getPolygon(4);
        assertTrue(square.isPresent());
        assertTrue(square.get() instanceof Square);
    }

    @Test
    public void noPolygonTest() {
        PolygonFactory factory = new PolygonFactory();

        Optional<Polygon> polygon = factory.getPolygon(10);
        assertFalse(polygon.isPresent());
    }
}
