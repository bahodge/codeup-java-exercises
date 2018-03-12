package lecnotes.fileio;

import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("src", "util","Input.java");
//        Path badPath = Paths.get("somewhere", "something.java");

////        Good File Path
//        System.out.println(Files.exists(path)); //True
//        System.out.println(Files.notExists(path)); //False
////        Bad File Path
//        System.out.println(Files.exists(badPath)); //False
//        System.out.println(Files.notExists(badPath)); //True


//        -----------------WRITING TO A FILE-----------------
//        Files.createDirectory(Paths.get("readme"));
//        if (!Files.exists(Paths.get("README.md"))){
//            Files.createFile(Paths.get("README.md"));
//        }
//
//        ArrayList<String> readmeContents = new ArrayList<>();
//        readmeContents.add("Teddy Java Exercises");
//        readmeContents.add("");
//        readmeContents.add("This is the repository for the teddy cohort's java exercises.");
//
//        Files.write(
//                Paths.get("README.md"),
//                readmeContents,
//                StandardOpenOption.APPEND
//        );


//        -----------------Reading TO A FILE-----------------
//        List<String> bobClass = Files.readAllLines(Paths.get("src", "Bob.java"));
//
////        Add line numbers to the Bob.java file
//        for (int i = 0; i < bobClass.size(); ++i){
//            String line = bobClass.get(i);
//            System.out.printf("%d: %s\n", i + 1, line);
//        }

//        -----------------Transforming TO A FILE-----------------
        //Create new Class that lowercases all the lines in a file.
//        List<String> readme = Files.readAllLines(Paths.get("README.md"));
//        ArrayList<String> lowerCasedReadme = new ArrayList<>();
//
//        for (String line : readme){
//            lowerCasedReadme.add(line.toLowerCase());
//        }
//
//
//        Files.write(Paths.get("README-lowercased.md"), lowerCasedReadme);

    }


}
