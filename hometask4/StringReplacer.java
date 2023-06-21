package hometask4;

import java.util.Scanner;

public class StringReplacer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your line");
        String str = scan.nextLine();
        char[] letters = str.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
