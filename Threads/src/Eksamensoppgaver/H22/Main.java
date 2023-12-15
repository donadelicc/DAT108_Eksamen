package Eksamensoppgaver.H22;

import Eksamensoppgaver.H22.Fib.Fibonacci;

public class Main {

    public static void main(String [] args) {

        
        final int N = 50;



        // Thread fibbThread = new Thread() {
        //     @Override
        //     public void run() {
        //         Fibonacci.fib(N);
        //     }
        // };

        Thread fibbThread = new Thread(() -> System.out.println(("\nSvar: " + Fibonacci.fib(N))));

        System.out.print("Beregner fib(" + N + "): ");

        fibbThread.start();

        try {
            while(fibbThread.isAlive()) {
                Thread.sleep(1000);
                System.out.print(".");
            }
        } catch (InterruptedException e){
            System.out.print(e);
        }


    }


    
}
