import java.util.Scanner;

public class ElectricityCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of users: ");
        int numUsers = scanner.nextInt();

        for (int i = 1; i <= numUsers; i++) {
            System.out.print("Enter the connection ID for user " + i + ": ");
            int connectionId = scanner.nextInt();

            System.out.print("Enter the number of units consumed for user " + i + ": ");
            int unitsConsumed = scanner.nextInt();

            String userName = "User " + connectionId;
            double charges = 0.0;

            if (unitsConsumed >= 1 && unitsConsumed <= 100) {
                charges = unitsConsumed * 1.0;
            } else if (unitsConsumed >= 101 && unitsConsumed <= 200) {
                charges = 100 + (unitsConsumed - 100) * 1.5;
            } else if (unitsConsumed >= 201 && unitsConsumed <= 500) {
                charges = 200 + (unitsConsumed - 200) * 2.0;
            } else {
                charges = 500 + (unitsConsumed - 500) * 3.5;
            }

            System.out.println(userName + " - Charges: Rs. " + charges);
        }

        scanner.close();
    }
}

