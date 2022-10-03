package ru.gb.lights;

import ru.gb.ReadyToClose;

public abstract class Light implements ReadyToClose {
    private boolean lightOn;

    public void On() {
        this.lightOn = true;
        System.out.println("Light on");
        LightOn();
    }
    protected abstract void LightOn();


    public void Off() {
        this.lightOn = false;
        System.out.println("Light on");
        LightOff();
    }
    protected abstract void LightOff();
}
