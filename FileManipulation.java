import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManipulation {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Read data from the input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            StringBuilder fileContent = new StringBuilder();

            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            reader.close();

            // Manipulate the data (convert to uppercase)
            String modifiedContent = fileContent.toString().toUpperCase();

            // Write the modified data to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(modifiedContent);
            writer.close();

            System.out.println("File manipulation completed successfully.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

