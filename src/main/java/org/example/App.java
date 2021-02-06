package org.example;

public class App {

    public static void main( String[] args ) {

        Race race = new Race();


        Engine daciaEngine = new Engine();
        daciaEngine.manufacturer = "Romania";
        RadioControlledCar dacia = new RadioControlledCar(daciaEngine);
        dacia.setName("Dacia");
        dacia.setColor("red");
        dacia.setDoorCount(4);
        dacia.setWheelCount(4);
        dacia.setMileage(8.5);


        Engine ladaEngine = new Engine();
        ladaEngine.manufacturer = "Russia";
        RadioControlledCar lada = new RadioControlledCar(ladaEngine);
        lada.setName("Lada");
        lada.setColor("blue");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(8);


        race.firstCar = dacia;
        race.secondCar = lada;


        dacia.accelerate(18.1);


    }
}

