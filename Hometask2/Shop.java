package Hometask2;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sum;
        System.out.println("Enter your sum");
        sum =  scan.nextDouble();
        double totalSum = sum >1400 ? sum *0.93 : sum;
        System.out.println(totalSum);
    }
}
