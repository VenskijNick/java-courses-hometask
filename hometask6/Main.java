package hometask6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("1234 5678 9012 3456", 1000);
        CreditCard card2 = new CreditCard("9876 5432 1098 7654", 500);
        CreditCard card3 = new CreditCard("1111 2222 3333 4444", 200);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Check balance");
            System.out.println("2. Add funds");
            System.out.println("3. Withdraw funds");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                card1.printInfo();
                card2.printInfo();
                card3.printInfo();
            } else if (choice.equals("2")) {
                System.out.print("Enter amount to add: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter card number (1, 2, or 3): ");
                String card = scanner.nextLine();
                if (card.equals("1")) {
                    card1.addFunds(amount);
                } else if (card.equals("2")) {
                    card2.addFunds(amount);
                } else if (card.equals("3")) {
                    card3.addFunds(amount);
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter card number (1, 2, or 3): ");
                String card = scanner.nextLine();
                if (card.equals("1")) {
                    card1.withdrawFunds(amount);
                } else if (card.equals("2")) {
                    card2.withdrawFunds(amount);
                } else if (card.equals("3")) {
                    card3.withdrawFunds(amount);
                }
            } else {
                break;
            }
        }
    }
}