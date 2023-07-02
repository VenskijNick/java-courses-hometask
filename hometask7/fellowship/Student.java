package hometask7.fellowship;

public class Student {


    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;
    protected int fellowship;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    protected int getFellowship() {
        if (averageMark >= 5) {
            return 50;
        } else {
            return 10;
        }
    }


}
