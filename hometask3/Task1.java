package hometask3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        if (temperature > -5) {
            System.out.println("Warm");
        } else if (temperature <= -20) {
            System.out.println("Cold");

        } else if (temperature <= -5 && temperature > -20) {
            System.out.println("Normal");
        }
    }
}
