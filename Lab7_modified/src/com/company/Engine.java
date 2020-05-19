package com.company;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.CyclicBarrier;
import java.lang.Object;

public class Engine{


    static int radius = 1;
    static double x, y, Pi;
    static int numOfIt = 1000000;


    public static double calculations(int nThreads) {
        double[] piArray = new double[nThreads];

        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < nThreads; i++) {
            service.submit(new Runnable() {
                public void run() {
                    double numIn = 0;
                    for (int i = 0; i < numOfIt; i++) {
                        x = Math.random();
                        y = Math.random();
                        if (Math.pow(x, 2) + Math.pow(y, 2) <= radius) {
                            numIn++;
                        }
                    }
                    Pi = 4 * numIn / numOfIt;
                    System.out.println("Pi: " + Pi);
                }
            });

        }
        return(Pi);
    }
}
