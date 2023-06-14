package lesson3;

import java.util.Scanner;

public class AgeChecer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Accept");

        } else {
            System.out.println("Denied");
        }
    }
}
