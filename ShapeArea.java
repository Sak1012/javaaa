import java.util.Scanner;

class Shape {
    double dimension1;
    double dimension2;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension 1: ");
        dimension1 = scanner.nextDouble();
        System.out.print("Enter dimension 2: ");
        dimension2 = scanner.nextDouble();
    }

    public void displayArea() {
        System.out.println("Area: " + (dimension1 * dimension2));
    }
}

class Triangle extends Shape {
    @Override
    public void displayArea() {
        System.out.println("Area of Triangle: " + (0.5 * dimension1 * dimension2));
    }
}

class Rectangle extends Shape {
    @Override
    public void displayArea() {
        System.out.println("Area of Rectangle: " + (dimension1 * dimension2));
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for Triangle, 2 for Rectangle: ");
        int choice = scanner.nextInt();

        Shape shape;

        switch (choice) {
            case 1:
                shape = new Triangle();
                break;
            case 2:
                shape = new Rectangle();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        shape.getData();
        shape.displayArea();
    }
}

