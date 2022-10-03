package ru.gb.engine;

import ru.gb.Checkable;
import ru.gb.ReadyToClose;

public abstract class Engine implements Checkable {
    private Boolean work;

    public void start() {
        this.work = true;
        System.out.println("Двигатель запущен");
        startInternal();
    }
    protected abstract void startInternal();

    public void stop() {
        this.work = false;
        System.out.println("Двигатель остановлен");
        stopInternal();
    }
    protected abstract void stopInternal();

    public void throttleUp(int level) {     // Увеличение оборотов двигателя
        if (this.work) {
            System.out.printf("Дросель открыт %d%n", level);
            throttleUpInternal(level);
        }
    }
    protected abstract void throttleUpInternal(int level);

    public void throttleDown(int level) {     // Уменьшение оборотов двигателя
        if (this.work) {
            System.out.printf("Дросель закрыт %d%n", level);
        }
    }

    public Boolean getWork() {
        return work;
    }

}