import java.util.Scanner;

public class TheatreSeatingArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the dimensions of the theatre seating arrangement
        int numRows = 5;  // Number of rows
        int numCols = 10; // Number of seats per row

        // Create a 2D array to represent the seating arrangement
        int[][] theatreSeats = new int[numRows][numCols];

        // Initialize the seating arrangement with empty seats
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                theatreSeats[row][col] = 0; // 'E' represents an empty seat
            }
        }

        // Display the initial seating arrangement
        System.out.println("Initial Seating Arrangement:");
        displaySeatingArrangement(theatreSeats);

        // Simulate seat reservation
        while (true) {
            System.out.print("Enter the row and seat number to reserve (e.g., '2 3'), or '0 0' to exit: ");
            int row = scanner.nextInt();
            int seat = scanner.nextInt();

            if (row == 0 && seat == 0) {
                break; // Exit the program
            }

            if (row < 1 || row > numRows || seat < 1 || seat > numCols) {
                System.out.println("Invalid row or seat number. Try again.");
                continue;
            }

            if (theatreSeats[row - 1][seat - 1] == 0) {
                theatreSeats[row - 1][seat - 1] = 1; // 'X' represents a reserved seat
                System.out.println("Seat reserved successfully!");
            } else {
                System.out.println("Seat is already reserved. Try again.");
            }

            // Display the updated seating arrangement
            displaySeatingArrangement(theatreSeats);
        }

        System.out.println("Thank you for using the seating arrangement program.");
    }

    // Function to display the seating arrangement
    public static void displaySeatingArrangement(int[][] seats) {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[0].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}

