package hometask10.palindromchecker;


import java.util.Scanner;

public class PalindromeCheckerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        System.out.print("Введите номер слова: ");
        int wordIndex = scanner.nextInt();

        String[] words = inputString.split("\\s+");
        if (wordIndex > words.length) {
            System.out.println("Номер слова превышает количество слов в строке");
            return;
        }

        String selectedWord = words[wordIndex - 1];
        if (PalindromeChecker.isPalindrome(selectedWord)) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
    }

}
