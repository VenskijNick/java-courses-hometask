package lesson3;

import java.util.Scanner;

public class SwitchTime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String time = scan.next();

        switch (time) {
            case "morning" -> {
                System.out.println("Morning starts from 6 am to 12 am");
            }

            case "Day" -> System.out.println("Day starts from 12 am to 6 pm");

            case "evening" -> System.out.println("Evening starts from 6 pm to 11 pm");

            case "night" -> System.out.println("Night starts from 11 pm to 6 am");

            default -> System.out.println("Unknown time");
        }

    }

}
