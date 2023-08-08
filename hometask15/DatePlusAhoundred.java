package hometask15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePlusAhoundred {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth date ");
        String input = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate futureDate = birthDate.plusYears(100);

        DateTimeFormatter output = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = futureDate.format(output);

    }
}
