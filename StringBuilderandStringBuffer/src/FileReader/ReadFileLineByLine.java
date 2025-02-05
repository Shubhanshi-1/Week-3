package FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

        public static void main(String[] args) {
            //Provide a file path
            String filePath = "FindVowel.java"; // Change this to your file path

            //Create file reader
            try (FileReader fileReader = new FileReader(filePath);
                 //Create Buffer Reader
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                //Printing the error message
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
    }


