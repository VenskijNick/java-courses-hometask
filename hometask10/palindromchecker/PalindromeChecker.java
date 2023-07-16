package hometask10.palindromchecker;


public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedWord = new StringBuilder(cleanWord).reverse().toString();
        return cleanWord.equals(reversedWord);
    }
}