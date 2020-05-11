package com.company;
import com.google.gson.Gson;
public class Main {

    public static void main(String[] args) {
        Person Danyil = new Person(25, 56, 178);
        Person Nicola = new Person(12, 58, 182);
        Person Misha = new Person(25,56,178);

        System.out.println(Danyil.equals(Misha));
        System.out.println(Nicola.equals(Danyil));
        System.out.println(serializePerson());
        System.out.println(deserializePerson());

    }

    public static String serializePerson(){
        Person person = new Person(22,89,190);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        return (json);
    }

    public static Person deserializePerson(){
        String personFromJson = "{'id':89,'weight':44,'height':168}";
        Gson gson = new Gson();
        Person Katya = gson.fromJson(personFromJson, Person.class);
        return (Katya);

    }
}
