package ru.gb;

public class Door {
    private boolean doorLock;

    public void doorClose(){
        this.doorLock = true;
        System.out.println("The door is closed");
    }

    public void doorOpen(){
        this.doorLock = false;
        System.out.println("The door is opened");
    }
}
