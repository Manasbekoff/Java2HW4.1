package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 5; i++) {
            Runner runner = new Runner("Runner " + i);
            runner.setRunnerNumber(i + 1);
            runner.start();
            runner.join();
        }
        for (int i = 5; i > 1 ; i--) {
            Runner runner1 = new Runner("Runner " + i);
            runner1.setRunnerNumber(i-1);
            runner1.start();
            runner1.join();
        }
    }
}
