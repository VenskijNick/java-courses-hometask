package hometask3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String size;
        System.out.println("Enter your clothing size");


        switch (size = scan.nextLine().toUpperCase()){
            case "XS" -> System.out.println("very small");
            case "S" -> System.out.println("small");
            case "M" -> System.out.println("average");
            case "L" -> System.out.println("big");
            case "XL" -> System.out.println("realy big");
            case "XXL", "XXXL", "XXXXL", "XXXXXL" -> System.out.println("realy, realy big");
            default -> System.out.println("Error");

        }
    }
}
