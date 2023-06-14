package lesson3;

import java.util.Scanner;

public class TimeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours;

        hours = scan.nextInt();

        if (hours > 0 && hours <= 4) {
            System.out.println("ночь");
        } else if (hours > 4 && hours <= 12) {
            System.out.println("утро");

        } else if (hours > 12 && hours <= 18) {
            System.out.println("день");

        } else if (hours > 18 && hours <= 23) {
            System.out.println("вечер");

        } else {
            System.out.println("error");
        }

    }
}
