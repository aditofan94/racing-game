package org.example;

public class Vehicle {

    private String name;
    private String color;
    private int wheelCount;

    public double accelerate (double speed) {
        System.out.println(speed);
        return 10.5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;

    }

}
