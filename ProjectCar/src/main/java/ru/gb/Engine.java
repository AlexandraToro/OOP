package ru.gb;

public class Engine {
    private boolean work;

    public void start(){
        this.work =true;
        System.out.println("Engine started");;
    }
    public void stop(){
        this.work = false;
        System.out.println("Engine ended");;
    }
    public void throttleUp(int level){
        if(this.work){
        System.out.println("Open "+level);}
    }

    public boolean getWork() {
        return work;
    }
}
