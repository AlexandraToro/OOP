package ru.gb.lights;

import ru.gb.lights.Light;

public class DippedHeadlights extends Light {
    @Override
    protected void LightOn() {
        System.out.println("Ближний свет фар включен");
    }

    @Override
    protected void LightOff() {
        System.out.println("Ближний свет фар выключен");
    }

    @Override
    public void turnedOff() {
        System.out.println("Фары отключены, к включению сигнализации");
    }
}
