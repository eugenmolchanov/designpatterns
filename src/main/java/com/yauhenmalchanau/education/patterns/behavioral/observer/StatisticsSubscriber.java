package com.yauhenmalchanau.education.patterns.behavioral.observer;

public class StatisticsSubscriber implements Observer {

    private FootballMatchStats stats;

    public StatisticsSubscriber() {
        this.stats = new FootballMatchStats();
    }

    @Override
    public void update(MatchStats matchStats) {
        this.stats = (FootballMatchStats) matchStats;
    }

    public String whatsTheScore() {
        return stats.score();
    }
}
