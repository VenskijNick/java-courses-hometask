package hometask16;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamHometasks {
    public static void main(String[] args) {
        stringValid("SFAgreg");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println("List: " + list);


        List<Integer> evenList = list.stream().distinct().filter(i -> i >= 7 && i <= 17 && i % 2 == 0)
                .map(i -> i * 2).sorted().limit(4).toList();

        System.out.println("Even numbers between 7 and 17, multiplied by 2, sorted, and limited to 4: " + evenList);

        int sum = list.stream().mapToInt(i -> i).sum();
        System.out.println("Total sum: " + sum);


    }

    static void stringValid(String str) {
        if (str != null) {
            if (str.length() > 4) {
                System.out.println(str.substring(0, 4));
            }
        } else {
            System.out.println("JAVA");
        }
        // как мне кажется, что без потоков тут сильно проще выходит
    }
}
