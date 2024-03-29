package newHometask;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class PersonRunner {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the file path: ");
        String filePath;
        try {
            filePath = reader.readLine();
        } catch (IOException exception) {
            System.out.println("Couldn't file path: " + exception.getMessage());
            return;
        }
        reader.close();
        List<Person> personList = new ArrayList<>();
        BufferedReader fileReader;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));

        } catch (FileNotFoundException exception) {
            System.out.println("File not found: " + exception.getMessage());
            return;
        }
        String line;
        try {
            while ((line = fileReader.readLine()) != null) {
                String[] fields = line.split(",");
                String firstName = fields[0].trim();
                String lastName = fields[1].trim();
                String gender = fields[2].trim();
                int age = Integer.parseInt(fields[3].trim());
                personList.add(new Person(firstName, lastName, gender, age));
            }
            fileReader.close();
        } catch (IOException exception) {
            System.out.println("Error reading file: " + exception.getMessage());
        }

        personList.sort(Comparator.comparing(Person::getSurname).thenComparing(Person::getName));

        // Write the sorted persons back to the file
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(filePath);
            for (Person person : personList) {
                fileWriter.write(person.getName() + ", " + person.getSurname() + ", " + person.getSex() + ", " + person.getAge() + "\n");
            }
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("Error writing to the file: " + exception.getMessage());
        }
        // Count the persons with age > 30
        long count = personList.stream().filter(person -> person.getAge() > 30).count();
        System.out.println("Count: " + count);

        // Count the males and females
        long males = personList.stream().filter(person -> person.getSex().equals("male")).count();
        long females = personList.stream().filter(person -> person.getSex().equals("female")).count();
        System.out.println("male:" + males);
        System.out.println("female:" + females);
    }
}






