package com.yauhenmalchanau.education.patterns.behavioral.observer;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

public class ObserverPatternTest {

    @Test
    public void shouldTestObserverPattern() {
        var publisher = new SportsEventsPublisher();
        var statsSub = new StatisticsSubscriber();
        var anotherSub = new AnotherSportsSubscriber();

        Stream.of(statsSub, anotherSub)
                .forEach(publisher::addObserver);

        Assert.assertNull(statsSub.whatsTheScore());
        Assert.assertNull(anotherSub.whatsTheScoreFromAnotherSource());

        var newScore = "1:1";
        publisher.scoreChanged(newScore);

        Assert.assertEquals(newScore, statsSub.whatsTheScore());
        Assert.assertEquals(newScore, anotherSub.whatsTheScoreFromAnotherSource());
    }

    private static class AnotherSportsSubscriber implements Observer {

        private FootballMatchStats matchStats;

        public AnotherSportsSubscriber() {
            this.matchStats = new FootballMatchStats();
        }

        @Override
        public void update(MatchStats matchStats) {
            this.matchStats = (FootballMatchStats) matchStats;
        }

        public String whatsTheScoreFromAnotherSource() {
            return matchStats.score();
        }

    }
}
