package com.company;

public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    public int getRunnerNumber() {
        return runnerNumber;
    }

    public void setRunnerNumber(int runnerNumber) {
        this.runnerNumber = runnerNumber;
    }

    private int runnerNumber;

    @Override
    public synchronized void run() {
        try {
            if (getPriority() == 5) {
                System.out.println(this.getName() + " Бежит к финишу");
            } else
                System.out.println(this.getName() + " Берет палочку");
            System.out.println(this.getName() + " бежит к Runner " + getRunnerNumber());
            if (getRunnerNumber() == 1)
                System.out.println("Runner 1 берет палочку");
            sleep(500);
        } catch (InterruptedException e) {
        }
    }
}
