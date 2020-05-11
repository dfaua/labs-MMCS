package com.company;

public class Person {
    int id;
    int weight;
    int height;

    public Person (int id, int weight, int height){
        this.id = id;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object obj){
        Person otherPerson = (Person) obj;
        return  this.id == otherPerson.id &&
                this.weight == otherPerson.weight &&
                this.height == otherPerson.height;
    }
}
