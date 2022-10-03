package ru.gb.lights;

import ru.gb.ReadyToClose;
import ru.gb.lights.Light;

public class LightInCar extends Light{

    @Override
    protected void LightOn() {
        System.out.println("включен свет в салоне");
    }

    @Override
    protected void LightOff() {
        System.out.println("Выключен свет в салоне");
    }

    @Override
    public void turnedOff() {
        System.out.println("Готово к закрытию");
    }
}
