package com.company;
import org.junit.internal.runners.model.EachTestNotifier;

import java.lang.String;
import java.util.Scanner;

public class Main {
    Scanner str = new Scanner(System.in);

    public static void main(String[] args) {


        Words words = new Words();

        System.out.println(words.countAverage());
        words.distribution();
        words.printDistribution();


    }

}
