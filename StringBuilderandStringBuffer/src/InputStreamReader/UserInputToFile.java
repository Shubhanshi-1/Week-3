package InputStreamReader;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        String filePath = "user_input.txt"; // Output file name

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader consoleReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filePath, true); // Append mode
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Enter text to write to the file (type 'exit' to stop):");

            String inputLine;
            while (!(inputLine = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(inputLine);
                bufferedWriter.newLine(); // Move to the next line
            }

            System.out.println("User input has been saved to " + filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
