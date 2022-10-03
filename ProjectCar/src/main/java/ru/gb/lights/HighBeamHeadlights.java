package ru.gb.lights;

import ru.gb.lights.Light;

public class HighBeamHeadlights extends Light {
    @Override
    protected void LightOn() {
        System.out.println("Дальний свет фар включен");
    }

    @Override
    protected void LightOff() {
        System.out.println("Дальний свет фар выключен");
    }

    @Override
    public void turnedOff() {
        System.out.println("Фары отключены, готовы к включению сигнализации");
    }
}
