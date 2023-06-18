package hometask3;

import java.util.Scanner;


public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;
        String formula = "";
        for (int i = 1; i <= n; i++) {
            sum += i;
            formula += i + "+";
        }
        formula = formula.substring(0, formula.length() - 1);

        System.out.println("Sum of all positive integers up to " + n + " is " + sum);
        System.out.println("Formula: " + formula + "=" + sum);


    }
}

