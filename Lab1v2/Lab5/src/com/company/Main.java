package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Engine eng = new Engine();
            eng.fileRead("C:\\Users\\Danyil\\IdeaProjects\\Lab5\\forRead.txt", "WritedFile.txt");
        }
        catch (Exception e){
            System.out.println("ERROR in main");
        }
    }
}
