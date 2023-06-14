package lesson3;

import java.util.Scanner;

public class WeekendCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.next();

        switch (day.toLowerCase()) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("Weekday");
            case "saturday", "sunday" -> System.out.println("Weekend");
            default -> System.out.println("Unknown day");
        }


    }
}
