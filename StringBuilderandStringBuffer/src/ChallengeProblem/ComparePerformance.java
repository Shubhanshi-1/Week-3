package ChallengeProblem;

import java.io.*;

public class ComparePerformance {
    public static void main(String[] args) {
        compareStringBuilderAndBuffer();
        compareFileReaders("largefile.txt"); // Change to your large file path
    }

    // Compare StringBuilder and StringBuffer performance
    public static void compareStringBuilderAndBuffer() {
        int iterations = 1_000_000;
        String text = "hello";

        // Measure StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Measure StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // Compare FileReader and InputStreamReader performance
    public static void compareFileReaders(String filePath) {
        try {
            // FileReader
            long startTime = System.nanoTime();
            try (FileReader fileReader = new FileReader(filePath);
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                int wordCount = countWords(bufferedReader);
                System.out.println("FileReader Word Count: " + wordCount);
            }
            long endTime = System.nanoTime();
            System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000 + " ms");

            // InputStreamReader
            startTime = System.nanoTime();
            try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath), "UTF-8");
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                int wordCount = countWords(bufferedReader);
                System.out.println("InputStreamReader Word Count: " + wordCount);
            }
            endTime = System.nanoTime();
            System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static int countWords(BufferedReader bufferedReader) throws IOException {
        int wordCount = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        return wordCount;
    }
}
