package lesson12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTasks {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("str", "str1", "str2");
        List<String> streamFromList = List.of("arcgrg", "tg", "sin", "arccos", "ASIN", "ACOS");
        streamFromList.stream().peek(System.out::println).filter(str -> str.startsWith("A")).peek(System.out::println).map(str -> "String: " + str).forEach(System.out::println);


        streamFromList.stream().sorted(Comparator.comparingInt(s -> s.charAt(s.length() - 1))).limit(3).forEach(str -> System.out.println(str + " "));
    }
}
 