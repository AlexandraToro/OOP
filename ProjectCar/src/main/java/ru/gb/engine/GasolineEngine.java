package ru.gb.engine;

import ru.gb.engine.Engine;

public class GasolineEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("Газовый двигатель запущен");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Газовый двигатель остановлен");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.println("Газовый двигатель ускорен");
    }

    @Override
    public void check() {
        System.out.println("Ок");
    }

}