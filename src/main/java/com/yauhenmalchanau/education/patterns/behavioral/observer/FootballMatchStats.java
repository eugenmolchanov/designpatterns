package com.yauhenmalchanau.education.patterns.behavioral.observer;

public record FootballMatchStats(String score) implements MatchStats {

    public FootballMatchStats() {
        this(null);
    }
}
