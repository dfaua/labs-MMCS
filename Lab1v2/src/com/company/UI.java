package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> phrases = new ArrayList<>();
    ArrayList<String> distributed = new ArrayList();
    Engine engine = new Engine();
    int arraySize;
    public void enterPhrases (){
        System.out.println("Enter the number of phrases you will enter: ");
        arraySize = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < arraySize; i++){
            phrases.add(scan.nextLine());
        }
    }
    public void sendPhrases(){
        distributed = engine.getPhrases(phrases);
    }

    public void printOut(){
        System.out.println("distributed phrases: \nLess or equal to average: ");

        for (int i = 0; i <= arraySize; i++){
            if (distributed.get(i) != "middle05887924651884313216797954305"){
                System.out.println(distributed.get(i));
            }
            else {System.out.println("More than average: ");}
        }
    }

}
