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
    public void run() {
        try {
            if (getRunnerNumber() == 4)
                System.out.println(this.getName() +" Бежит к финишу");
            if ( getRunnerNumber() == 0 ) {
                System.out.println(this.getName() + " Берет палочку ");
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
