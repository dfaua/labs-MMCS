package com.company;

import java.util.ArrayList;

public class FireCar {
    private static int nSeats = 6;
    private static ArrayList<String> passengers = new ArrayList<>();

    public int getnSeats() {
        return nSeats;
    }
    public static void addPassenger(int humChoice, String name){
        if (humChoice == 3){
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
