package ru.gb.base;

import ru.gb.Checkable;

public class Wheel implements Checkable {
    public void rotate() {
        System.out.println("Колесо крутится");
    }

    @Override
    public void check() {
        System.out.println("Ок");
    }

}
