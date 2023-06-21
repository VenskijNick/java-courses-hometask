package hometask4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Gen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter array size: ");

        int[] arr = new int[scanner.nextInt()];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
            sum += arr[i];
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        double avg = (double) sum / arr.length;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        System.out.println("avg : " + avg);
    }
}
