package hometask15;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FormatStringUsingFunctionalInterfaces {
    public static void main(String[] args) {
        String input = "I dont know!";

        Predicate<String> containsExclamationNotQuestion = s -> s.contains("!") && !s.contains("?");
        boolean containsExclamationNotQuestionResult = containsExclamationNotQuestion.test(input);
        System.out.println(containsExclamationNotQuestionResult);

        Function<String, Character> getLastCharacter = s -> s.charAt(s.length() - 1);
        char lastCharacter = getLastCharacter.apply(input);
        System.out.println(lastCharacter);

        Consumer<String> printLasCharaster = s -> System.out.println(s.charAt(s.length() - 1));
        printLasCharaster.accept(input);

        Function<String, String> getSubstring = str ->
                str.length() > 4 ? str.substring(1, 4) : null;
        String substring = getSubstring.apply(input);
        System.out.println(substring);

        Supplier<String> getString = () -> "JAVA is the BEST";
        String result = getString.get();
        System.out.println(result);


    }
}
