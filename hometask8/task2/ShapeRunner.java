package hometask8.task2;

import java.util.Scanner;

public class ShapeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter length: ");
                    length = scanner.nextDouble();
                    shape = new Square(length);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            if (shape != null) {
                System.out.println("Area: " + shape.getArea());
            }
        }
    }
}
