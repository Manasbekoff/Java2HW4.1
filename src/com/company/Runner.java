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
    public void run(){
        try {
            if (runnerNumber == 6){
                System.out.println(this.getName() + " Берет палочку ");
            System.out.println(this.getName() + " бежит к финишу ");
        }else
                System.out.println(this.getName() + " Берет палочку");
            System.out.println(this.getName() + " бежит к Runner " + getRunnerNumber());
            sleep(500);
        } catch (InterruptedException e){}

    }
}
