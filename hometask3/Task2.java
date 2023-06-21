package hometask3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time;
        System.out.println("Enter the time: ");
        time = scan.nextInt();
        if ((time >= 10) && (time <= 19)) {
            System.out.println("Welcome");
        } else if (time > 19) {
            System.out.println("Error");
        }else {
            System.out.println("Shop is closed");
        }
    }
}
