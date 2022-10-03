package ru.gb.engine;

import ru.gb.engine.Engine;

public class ElectricEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("Электрический двигатель запущен");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Электрический двигатель остановлен");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.println("Электрический двигатель ускорен");
    }

    @Override
    public void check() {
        System.out.println("Ок");
    }

}