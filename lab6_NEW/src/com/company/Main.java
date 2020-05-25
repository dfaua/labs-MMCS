package com.company;

public class Main {

    public static void main(String[] args) {
        char keyChar = 'a';
        String rootDir = "G:\\Program\\Java\\lab6_NEW\\";
        FileHandler encodeFirst = new FileHandler(rootDir + "to_encode.txt", rootDir + "encoded.txt", keyChar);
        encodeFirst.Encode();
        FileHandler decodeThen = new FileHandler( rootDir + "encoded.txt", rootDir + "decoded.txt", keyChar);
        decodeThen.Decode();
    }
}
