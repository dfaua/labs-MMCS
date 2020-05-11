package com.company;
import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;

public class Words {
    static Scanner str = new Scanner(System.in);
    static int lengthOfArray = 3;
    static int phrase1Length;
    static int phrase2Length;
    static int phrase3Length;
    static String pr1;
    static String pr2;
    static String pr3;
    ArrayList<String> less = new ArrayList<>();
    ArrayList<String> more = new ArrayList<>();

    static int average;


    public static int countAverage(){
        System.out.println("1st phrase:");
        EnterPharses phrase1 = new EnterPharses(str.nextLine());
        pr1 = phrase1.string;
        System.out.println("2nd phrase:");
        EnterPharses phrase2 = new EnterPharses(str.nextLine());
        pr2 = phrase2.string;
        System.out.println("3rd phrase:");
        EnterPharses phrase3 = new EnterPharses(str.nextLine());
        pr3 = phrase3.string;
        int sum = 0;
        phrase1Length = phrase1.string.length();
        phrase2Length = phrase2.string.length();
        phrase3Length = phrase3.string.length();
            sum += phrase1Length;
            sum += phrase2Length;
            sum += phrase3Length;
        average = sum/lengthOfArray;
        System.out.println("average is: ");
        return(average);
    }

    public void distribution(){
            if (phrase1Length < average) less.add(pr1);
            else more.add(pr1);
            if (phrase2Length < average) less.add(pr2);
            else more.add(pr2);
            if (phrase3Length < average) less.add(pr3);
            else more.add(pr3);
    }

    public void printDistribution(){
        System.out.println("Less than average: ");

        for (String i : less){
            System.out.println(i);
        }
        System.out.println("More or equal to average: ");

        for (String i : more){
            System.out.println(i);
        }
    }


}
