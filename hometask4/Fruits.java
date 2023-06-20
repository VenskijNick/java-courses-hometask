package hometask4;

import java.util.Arrays;
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        String[] fruits = new String[]{"apple", "banana", "strawberry", "pineapple"};
        System.out.println(fruits[1] + " " + fruits[3]);
        fruits[2] = "something";

        System.out.println(Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));


    }
}
