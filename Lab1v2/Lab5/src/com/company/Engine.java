package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Engine {
    public static void fileRead(String pathToRead, String pathToWrite) {
        try {
            FileReader read = new FileReader(pathToRead);
            Scanner scan = new Scanner(read);
            ArrayList<String> fromFile = new ArrayList<>();
            while (scan.hasNextLine()) {
                fromFile.add(scan.nextLine());
            }
            scan.close();
            sorting_Writing(fromFile, pathToWrite);
        } catch (Exception e) {
            System.out.println("ERROR in fileRead");
        }
    }

    public static ArrayList<String> sorting_Writing(ArrayList<String> strings, String pathToWrite) {
        try {
            Comparator<String> strLengthComparator = new StringLengthSort();
            FileWriter fw = new FileWriter(pathToWrite);
            Collections.sort(strings, strLengthComparator);
            for (String i : strings) {
                fw.write(i + "\n");
            }
            fw.close();

        } catch (Exception e) {
            System.out.println("ERROR in sorting_Writing");
        }
        return (strings);
    }

}
