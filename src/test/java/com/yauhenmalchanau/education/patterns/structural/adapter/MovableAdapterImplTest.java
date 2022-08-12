package com.yauhenmalchanau.education.patterns.structural.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MovableAdapterImplTest {

  @Test
  public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
    Movable bugattiVeyron = new BugattiVeyron();
    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

    assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
  }

}
