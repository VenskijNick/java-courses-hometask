package hometask7.fellowship;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("John", "Doe", "Group A", 4.5);
        Student student2 = new Student("Jane", "Smith", "Group B", 5.0);
        Aspirant aspirant1 = new Aspirant("Alice", "Johnson", "Group C", 4.8, true);
        Aspirant aspirant2 = new Aspirant("Bob", "Williams", "Group D", 5.0, false);

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (Student student : students) {
            System.out.println("Fellowship for " + student.firstName + " " + student.lastName + ": " + student.getFellowship() + " rubles");
        }

    }
}
