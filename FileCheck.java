import java.io.File;

public class FileCheck {
    public static void main(String[] args) {
        // Prompt the user for a file name or path
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a file name or path: ");
        String fileName = scanner.nextLine();
        scanner.close();

        // Create a File object with the provided file name or path
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");

            // Check if the file is readable
            if (file.canRead()) {
                System.out.println("File is readable.");
            } else {
                System.out.println("File is not readable.");
            }

            // Check if the file is writable
            if (file.canWrite()) {
                System.out.println("File is writable.");
            } else {
                System.out.println("File is not writable.");
            }

            // Determine the type of file (directory or regular file)
            if (file.isDirectory()) {
                System.out.println("File is a directory.");
            } else {
                System.out.println("File is a regular file.");
            }

            // Get the length of the file in bytes
            long fileLength = file.length();
            System.out.println("File length: " + fileLength + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}

