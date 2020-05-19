package com.company;

import java.util.ArrayList;

public class Engine {
    static public ArrayList<String> getPhrases(ArrayList<String> phrases){
        int arraySize;
        int average;
        int sum = 0;
        arraySize = phrases.size();
        for (int i = 0; i < arraySize; i++){
            String str;
            str = phrases.get(i);
            sum += str.length();
        }
        average = sum/arraySize;
        return(distribution(phrases, average, arraySize));
    }
    static public ArrayList<String> distribution(ArrayList<String> phrases, int average, int size){
        ArrayList<String> distributedArray = new ArrayList<>();
        distributedArray.add("middle05887924651884313216797954305");
        for (int i = 0; i < size; i++){
            String str = phrases.get(i);
            if (str.length() <= average){
                distributedArray.add(0, str);
            }
            else{
                distributedArray.add(str);
            }
        }
        return (distributedArray);
    }
}
