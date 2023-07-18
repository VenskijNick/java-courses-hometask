package hometask11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbbreviationChecker {

    public static void Abbreviation(String input) {

        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void DocsChecker(String input) {
        Pattern docsPattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}");
        Matcher docsMatcher = docsPattern.matcher(input);

        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        Matcher phoneMatcher = phonePattern.matcher(input);

        Pattern emailPattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(input);

        while (docsMatcher.find()) {
            System.out.println("document number: " + docsMatcher.group());
        }

        while (phoneMatcher.find()) {
            System.out.println("telephone number: " + phoneMatcher.group());
        }

        while (emailMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
        }
    }
}
