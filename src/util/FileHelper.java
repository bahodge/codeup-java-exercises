package util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;

public class FileHelper {

    public static void main(String[] args) {

        String test = "test.txt";

//        //Creating a test file with some content!
        ArrayList<String> initialContent = new ArrayList<>();
        ArrayList<String> overwriteContent = new ArrayList<>();
        ArrayList<String> appendContent = new ArrayList<>();
        initialContent.add("This is some Initial Content");
        initialContent.add("Fear is the best");
        overwriteContent.add("Our lives for the God Emperor");
        appendContent.add("Brutality is a virtue");
        appendContent.add("The Tyranid Threat CANNOT be stopped");

        System.out.println();
        spit(test, initialContent);
        System.out.println(slurp(test));

        System.out.println();
        spit(test, overwriteContent);
        System.out.println(slurp(test));

        System.out.println();
        spit(test, appendContent, true);
        System.out.println(slurp(test));

        makeExciting(test);


    }

    public static List<String> slurp (String filePath) {
        List<String> list = null;
        try {
            list = Files.readAllLines(Paths.get(filePath));
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void spit(String filename, List<String> contents){
            try {
                if (!Files.exists(Paths.get(filename))){
                    Files.createFile(Paths.get(filename));
                }
                //Overwrites the file
                Files.write(Paths.get(filename), contents);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }

    public static void spit(String filename, List<String> contents, boolean append){
        try {
            if (append) {
                if (!Files.exists(Paths.get(filename))) {
                    Files.createFile(Paths.get(filename));
                }
                //Appends the file
                Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copy(String originalFile, String copyName) {
        try {
            System.out.println("Copying files ...");
            Files.copy(Paths.get(originalFile), Paths.get(copyName), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Done.");
        } catch (IOException e) {
            System.out.println("Copying failed: " + e.toString());
        }
    }

    public static void move(String oldPath, String newPath) {
        try {
            System.out.println("Moving files ...");
            Files.move(Paths.get(oldPath), Paths.get(newPath), StandardCopyOption.ATOMIC_MOVE);
            System.out.println("Done.");
        } catch (IOException e) {
            System.out.println("Moving failed: " + e.toString());
        } catch (UnsupportedOperationException t){
            System.out.println(t.toString());
        }
    }

    public static void makeExciting(String filename){
        //Exception is handled in slurp
        List<String> excitedLines = new ArrayList<>();
        for (String line : slurp(filename)){
            String excitedLine = line.toUpperCase() + "!";
            excitedLines.add(excitedLine);
        }
        spit(filename, excitedLines);
    }


}
