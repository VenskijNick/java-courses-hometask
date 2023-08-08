package hometask13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHometask {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\IdeaProjects\\courses\\src\\hometask13\\joke.txt");
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("Программист ставит себе на тумбочку перед сном два стакана. Один с водой - на случай, если захочет ночью пить. А второй пустой - на случай, если не захочет.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the joke.txt file and find the longest word
        String longestWord = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^а-яА-Я0-9]", "");
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Create the longest-word.txt file and write the longest word to it
        File outputFile = new File("C:\\Users\\user\\IdeaProjects\\courses\\src\\hometask13\\longest-word.txt");
        try {
            FileWriter writer = new FileWriter(outputFile);
            writer.write(longestWord);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
