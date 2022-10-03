package ru.gb;

public class Door implements ReadyToClose{
    private boolean doorLock;

    public void doorClose(){
        this.doorLock = true;
        System.out.println("Дверь закрыта");
    }

    public void doorOpen(){
        this.doorLock = false;
        System.out.println("Дверь открыта");
    }

    @Override
    public void turnedOff() {
        System.out.println("Двери закрыты, готовы к включению сигнализации");
    }
}
