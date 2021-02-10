package org.example;

public class Race {

    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;

    public Race(Vehicle firstCompetitor, Vehicle secondCompetitor) {
        this.firstCompetitor = firstCompetitor;
        this.secondCompetitor = secondCompetitor;
    }

    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public Vehicle getSecondCompetitor() {
        return secondCompetitor;
    }

}
