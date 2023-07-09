package hometask7.fellowship.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите количество купюр номиналом 20: ");
        int count20 = scanner.nextInt();

        System.out.print("Введите количество купюр номиналом 50: ");
        int count50 = scanner.nextInt();

        System.out.print("Введите количество купюр номиналом 100: ");
        int count100 = scanner.nextInt();

        ATM atm = new ATM(count20, count50, count100);
        System.out.println();

        atm.getInfo();

        while (true) {
            System.out.print("Введите сумму для снятия или 0 для выхода: ");
            int amount = scanner.nextInt();

            if (amount == 0) {
                break;
            }

            atm.moneyDrop(amount);
            atm.getInfo();
        }

        scanner.close();
    }
}

