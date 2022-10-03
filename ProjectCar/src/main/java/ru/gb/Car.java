package ru.gb;

import ru.gb.base.Base;
import ru.gb.lights.DippedHeadlights;
import ru.gb.lights.HighBeamHeadlights;
import ru.gb.lights.LightInCar;

import java.util.List;

public class Car{
    private Base base;
    private LightInCar lightInCar;
    private Door driverDoor;
    private DippedHeadlights dippedHeadlights;
    private HighBeamHeadlights highBeamHeadlights;
    private AirСonditioner airСonditioner;
    private List<ReadyToClose> readyToClose;

    public Car() {
        base = new Base();

        lightInCar = new LightInCar();
        driverDoor = new Door();
        airСonditioner = new AirСonditioner();
        dippedHeadlights = new DippedHeadlights();
        highBeamHeadlights = new HighBeamHeadlights();
        readyToClose = List.of(driverDoor, dippedHeadlights, highBeamHeadlights, base);
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

    public void readyToTurnOnTheAlarm(){
        for (ReadyToClose item: readyToClose) {
            item.turnedOff();
        }
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
        car.readyToTurnOnTheAlarm();
    }


}

