package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class Main {

    public static void main(String[] args) {
        Engine eng = new Engine();
        long time;
        ThreadMXBean threadTime = ManagementFactory.getThreadMXBean();
        Scanner scan = new Scanner(System.in);
        int nThreads;
        System.out.println("Enter the number of threads");
        nThreads = Integer.parseInt(scan.nextLine());
        eng.calculations(nThreads);
        System.out.println("\nThreads: " + nThreads + "\nIterations: 1000000");
        time = threadTime.getThreadCount();
        System.out.print("Time: ");
        System.out.println(time);
    }




}
