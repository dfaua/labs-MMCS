package com.company;

import java.util.ArrayList;

public class PoliceCar {
    private int nSeats = 4;
    private ArrayList<String> passengers = new ArrayList<>();

    public int getnSeats() {
        return nSeats;
    }
    public void addPassenger(int humChoice, String name){
        if (humChoice == 2){
            if (passengers.size() < nSeats){
                passengers.add(name);
            }
            else{
                System.out.println("No free seats!");
            }
        }
        else{
            System.out.println("We cannot add this person to the trip!");
        }

    }
    public int getFreeSeats(){
        return nSeats-passengers.size();
    }
    public void showPassengers(){
        for (String i:passengers) {
            System.out.print(i + " ");
        }
    }
    public void eliminatePassenger(int number){
        try {
            passengers.remove(number - 1);
        }
        catch (Exception e){
            System.out.println("ERROR");
        }
    }
}
