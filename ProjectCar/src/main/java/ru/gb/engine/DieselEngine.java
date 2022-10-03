package ru.gb.engine;

import ru.gb.engine.Engine;

public class DieselEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("Дизельный двигатель запущен");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Дизельныйдвигатель остановлен");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.println("Дизельныйдвигатель ускорен");
    }

    @Override
    public void check() {
        System.out.println("Ок");
    }

}