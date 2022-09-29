package ru.gb;

public class Car {
    private Base base;
    private LightInCar lightInCar;
    private Door driverDoor;
    private AirСonditioner airСonditioner;

    public Car() {
        base = new Base();
        lightInCar = new LightInCar();
        driverDoor = new Door();
        airСonditioner = new AirСonditioner();
    }
    public void startCar(){
        base.start();
    }

    public void stopCar(){
        base.stop();
    }

    public void driveCar(){
        base.drive();
    }

    public void openAllDoor(){
        driverDoor.doorOpen();
    }
    public void closeAllDoor(){
        driverDoor.doorClose();
    }

    public void airСonditionerOn(){
        airСonditioner.conditionerIsWork(20);
    }
    public void airСonditionerOff(){
        airСonditioner.stopConditioner();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.openAllDoor();
        car.closeAllDoor();
        car.startCar();
        car.driveCar();
        car.airСonditionerOn();
        car.airСonditionerOff();
        car.stopCar();
    }


}

