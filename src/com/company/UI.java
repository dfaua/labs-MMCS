package com.company;

import java.util.Scanner;

public class UI {

    Scanner scan = new Scanner(System.in);

    Taxi taxi = new Taxi();
    Bus bus = new Bus();
    PoliceCar policeCar = new PoliceCar();
    FireCar fireCar = new FireCar();

    Trip<Bus> tripBus = new Trip<>(bus);
    Trip<Taxi> tripTaxi = new Trip<>(taxi);
    Trip<PoliceCar> tripPoliceCar = new Trip<>(policeCar);
    Trip<FireCar> tripFireCar = new Trip<>(fireCar);

    public void start(){
        int choice;
        System.out.println("1. New trip; \n2. Show free seats; \n3. End trip;");
        choice = scan.nextInt();
        switch (choice) {
            case 1: newTrip(); break;
            case 2: showFreeSeats(); break;
            case 3: endTrip(); break;
            default:
                System.out.println("Wrong number"); break;
        }
    }
    public void newTrip(){
        int humanChoice;
        int carChoice;
        String name;
        System.out.println("1. Human; \n2. Policeman \n3. Firefighter");
        humanChoice = scan.nextInt();
        System.out.println("1. Bus; \n2. Taxi; \n3. Fire car; \n4. Police car");
        carChoice = scan.nextInt();
        System.out.println("Name of the passenger: ");
        name = scan.nextLine();
        switch (carChoice){
            case 1: tripBus.getAutomobile().addPassenger(humanChoice, name); break;
            case 2: tripTaxi.getAutomobile().addPassenger(humanChoice, name); break;
            case 3: tripPoliceCar.getAutomobile().addPassenger(humanChoice, name); break;
            case 4: tripFireCar.getAutomobile().addPassenger(humanChoice, name); break;
            default:
                System.out.println("Wrong number"); break;
        }
    }
    public void showFreeSeats(){
        int carChoice;
        int numberOfFreeSeats = 0;
        System.out.println("1. Bus \n 2. Taxi \n3. Fire Car \n4. Police Car");
        carChoice = scan.nextInt();
        switch (carChoice){
            case 1:
                numberOfFreeSeats = tripBus.getAutomobile().getFreeSeats(); break;
            case 2:
                numberOfFreeSeats = tripTaxi.getAutomobile().getFreeSeats(); break;
            case 3:
                numberOfFreeSeats = tripPoliceCar.getAutomobile().getFreeSeats(); break;
            case 4:
                numberOfFreeSeats = tripFireCar.getAutomobile().getFreeSeats(); break;
            default:
                System.out.println("ERROR"); break;
        }
        System.out.println(numberOfFreeSeats);
    }
    public void endTrip(){
        int carChoice = 0;
        int nPerson = 0;
        System.out.println("1. Bus \n 2. Taxi \n3. Fire Car \n4. Police Car");
        carChoice = scan.nextInt();
        switch (carChoice){
            case 1: tripBus.getAutomobile().showPassengers(); break;
            case 2: tripTaxi.getAutomobile().showPassengers(); break;
            case 3: tripFireCar.getAutomobile().showPassengers(); break;
            case 4: tripPoliceCar.getAutomobile().showPassengers(); break;
        }
        System.out.println("Number of person: ");
        nPerson = scan.nextInt();
        switch (carChoice){
            case 1: tripBus.getAutomobile().eliminatePassenger(nPerson); break;
            case 2: tripTaxi.getAutomobile().eliminatePassenger(nPerson); break;
            case 3: tripFireCar.getAutomobile().eliminatePassenger(nPerson); break;
            case 4: tripPoliceCar.getAutomobile().eliminatePassenger(nPerson); break;
        }
    }

}
