package hometask10.strmethods;

import java.util.Scanner;

public class StrMethodsRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        System.out.println(StrMethods.lastChar(str));
        System.out.println(StrMethods.checkStartOfString(str));
        System.out.println(StrMethods.checkEndOfString(str));
        System.out.println(StrMethods.stringContains(str));
        System.out.println(StrMethods.stringReplacer(str));
        System.out.println(StrMethods.lowercase(str));
        System.out.println(StrMethods.uppercase(str));
        System.out.println(StrMethods.substringer(str));
    }
}
