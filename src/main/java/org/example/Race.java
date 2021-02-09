package org.example;

public class Race {

    private RadioControlledCar firstCar;
    private RadioControlledCar secondCar;

    public Race(RadioControlledCar firstCar, RadioControlledCar secondCar) {
        this.firstCar = firstCar;
        this.secondCar = secondCar;
    }

    public RadioControlledCar getFirstCar() {
        return firstCar;
    }

    public RadioControlledCar getSecondCar() {
        return secondCar;
    }
}
