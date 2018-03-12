package util;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;

public class FIleHelper {

//    public static void main(String[] args) {
//
//        //Creating a test file with some content!
//        ArrayList<String> initialContent = new ArrayList<>();
//        initialContent.add("This is some Initial Content");
//        initialContent.add("Fear is the best");
//        initialContent.add("Our lives for the God Emperor");
//        initialContent.add("Brutality is a virtue");
//        initialContent.add("The Tyranid Threat CANNOT be stopped");
//
//        System.out.println();
//        System.out.println("Spitting coolText.txt w/ initial content");
//        spit("coolText.txt", initialContent);
//
//        System.out.println();
//        System.out.println("Slurping coolText.txt");
//        slurp("coolText.txt");
//        System.out.println(slurp("coolText.txt"));
//
//        ArrayList<String> appendingContent = new ArrayList<>();
//        appendingContent.add("The black death arrives");
//        appendingContent.add("Who am I to challenge the albatross");
//        appendingContent.add("The harbinger mans the gallows");
//        appendingContent.add("There is but pain in deceit");
//
//        System.out.println("Appending coolText.txt");
//        spit("coolText.txt", appendingContent, true);
//
//        System.out.println();
//        System.out.println(slurp("coolText.txt"));
//
//        System.out.println();
//        System.out.println("Making coolText.txt Exciting!");
//        makeExciting("coolText.txt");
//
////        System.out.println();
////        System.out.println("Making a copy of coolText.txt");
////        copy("coolText.txt", "a.txt");
////
////        System.out.println("Making a copy of coolText.txt");
////        move("coolText.txt", "b.txt");
//
//
//    }

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
        for (String line : slurp(filename)){
            System.out.println(line.toUpperCase() + "!");
        }
    }


}
