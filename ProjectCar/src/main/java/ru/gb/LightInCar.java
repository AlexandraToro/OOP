package ru.gb;

public class LightInCar extends Light{

    @Override
    protected void LightOnInternal() {
        System.out.println("включен свет в салоне");
    }

    @Override
    protected void LightOffInternal() {
        System.out.println("Выключен свет в салоне");
    }
}
