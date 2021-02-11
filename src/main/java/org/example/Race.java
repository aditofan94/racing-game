package org.example;

public class Race {

    private Vehicle [] competitors = new Vehicle [10];

    public Vehicle[] getCompetitors() {
        return competitors;
    }

    public void insertCompetitors (int index, Vehicle vehicle) {
        competitors [index] = vehicle;
    }
}
