package FileReader;

import java.io.*;

public class CountOccurrences {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Change this to your file path
        String targetWord = "Java"; // Change this to the word you want to count
        int wordCount = 0;

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split line into words using whitespace and punctuation as delimiters
                String[] words = line.split("\\W+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) { // Case-insensitive comparison
                        wordCount++;
                    }
                }
            }

            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
