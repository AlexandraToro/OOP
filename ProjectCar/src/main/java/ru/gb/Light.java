package ru.gb;

public abstract class Light {
    private boolean lightOn;

    public void LightOn() {
        this.lightOn = true;
        System.out.println("Light on");
        LightOnInternal();
    }
    protected abstract void LightOnInternal();


    public void LightOff() {
        this.lightOn = false;
        System.out.println("Light on");
        LightOffInternal();
    }
    protected abstract void LightOffInternal();
}
