package org.example;


public class App {

    public static void main( String[] args ) {

        Engine daciaEngine = new Engine();
        daciaEngine.setManufacturer("Romania");
        RadioControlledCar dacia = new RadioControlledCar(daciaEngine);
        dacia.setName("Dacia");
        dacia.setColor("red");
        dacia.setDoorCount(4);
        dacia.setWheelCount(4);
        dacia.setMileage(8.5);


        Engine ladaEngine = new Engine();
        ladaEngine.setManufacturer("Russia");
        RadioControlledCar lada = new RadioControlledCar(ladaEngine);
        lada.setName("Lada");
        lada.setColor("blue");
        lada.setDoorCount(2);
        lada.setWheelCount(4);
        lada.setMileage(8);

        Vehicle motorcycle = new RadioControlledMotorcycle(new Engine());
        motorcycle.accelerate(10);

        Race race = new Race();
        race.insertCompetitors( 0, dacia);
        race.insertCompetitors( 1, lada);

        for (Vehicle vehicle : race.getCompetitors()) {
            if (vehicle != null) {
                System.out.println(vehicle.getName());
            }
        }
    }
}

