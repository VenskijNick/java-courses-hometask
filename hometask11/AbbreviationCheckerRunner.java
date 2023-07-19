package hometask11;

import java.util.Scanner;

public class AbbreviationCheckerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        AbbreviationChecker.DocsChecker(input);
    }
}
