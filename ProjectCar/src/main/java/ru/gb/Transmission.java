package ru.gb;

public class Transmission {
    public int gearNumber;
    public void switchGear(int number){
        this.gearNumber = number;
        System.out.println("GEAR is "+ number);
    }

    public int getgearNumber(){
        return gearNumber;
    }
}
