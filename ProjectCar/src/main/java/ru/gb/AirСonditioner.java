package ru.gb;

public class AirСonditioner {
    public int temperatureLevel;
    private boolean isWork;

    public void conditionerIsWork(int temp) {
        this.isWork = true;
        temperatureLevel = temp;
        System.out.printf("A/C turned on at %s degrees %n",temp);
    }

    public void stopConditioner(){
        this.isWork = false;
        System.out.println("A/C off");
    }
}
