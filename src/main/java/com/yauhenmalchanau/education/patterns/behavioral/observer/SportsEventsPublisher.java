package com.yauhenmalchanau.education.patterns.behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class SportsEventsPublisher implements Observable {

    private String score;

    private final List<Observer> observers = new LinkedList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void scoreChanged(String newScore) {
        this.score = newScore;
        observers.forEach(observer -> observer.update(new FootballMatchStats(score)));
    }
}
