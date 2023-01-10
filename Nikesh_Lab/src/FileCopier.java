import java.io.*;

public class FileCopier {
    public static void main(String[] args) {
        // Set the source and destination file locations
        String sourceFile = "C:/Users/user/Downloads/original.txt";
        String destinationFile = "C:/Users/user/Downloads/duplicate.txt";

        try {
            // Create a FileInputStream to read the source file
            FileInputStream inputStream = new FileInputStream(sourceFile);

            // Create a FileOutputStream to write to the destination file
            FileOutputStream outputStream = new FileOutputStream(destinationFile);

            // Read the contents of the source file and write them to the destination file
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }

            // Close the input and output streams
            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
