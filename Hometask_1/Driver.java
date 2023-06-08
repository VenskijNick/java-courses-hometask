package Hometask_1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String name, carsNumber,carsBrand;
            char category;
            int cost;

        System.out.print("Enter your name, driver: ");
        name = scan.nextLine();
        System.out.print("Enter your category, "+name+": ");
        category = scan.nextLine().charAt(0);
        System.out.print("Enter your car number, " +name+": ");
        carsNumber = scan.nextLine();
        System.out.print("Enter your car brand: ");
        carsBrand = scan.nextLine();
        System.out.print("Enter yours service price: ");
        cost = scan.nextInt();

        System.out.println("Information about you:\nName: " +name+"\n"+ "Category: "+category+",\n"+"Car number: "+ carsNumber+"\n"+"Car brand: "+carsBrand+"\n"+"Service price: "+cost);

    }
}
