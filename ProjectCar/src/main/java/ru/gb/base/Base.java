package ru.gb.base;

import ru.gb.Checkable;
import ru.gb.ReadyToClose;
import ru.gb.engine.Engine;
import ru.gb.engine.GasolineEngine;

import java.util.List;

public class Base implements ReadyToClose {
    private Engine engine;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private List<Checkable> checkables;

    public Base() {
        engine = new GasolineEngine();
        wheel1 = new Wheel();
        wheel2 = new Wheel();
        wheel3 = new Wheel();
        wheel4 = new Wheel();
        transmission = new Transmission();
        checkables = List.of(engine, wheel1, wheel2, wheel3, wheel4, transmission);
    }

    public void start() {
        engine.start();
    }

    public void drive() {
        if (engine.getWork()) {
            engine.throttleUp(1);
            transmission.switchGear(1);
            wheel1.rotate();
            wheel2.rotate();
            wheel3.rotate();
            wheel4.rotate();
        }
    }

    public void stop() {
        transmission.switchGear(0);
        engine.throttleDown(0);
        engine.stop();
    }
    public void сheckAll() {

// engine.check(); // Это было как пример до интерфейса Checkable
// transmission.check();
// wheel1.check();
// wheel2.check();
// wheel3.check();
// wheel4.check();
        for (Checkable checkables : checkables) {
            checkables.check();
        }
    }

    @Override
    public void turnedOff() {
        System.out.println("Двигатель выключен, все готово к включению сигнализации");
    }

}
