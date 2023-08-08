package hometask8.task1;

public class JobsRunner {
    public static void main(String[] args) {
        Employee director = new Director();
        director.printJobTitle();

        Employee worker = new Worker();
        worker.printJobTitle();

        Employee accountant = new Accountant();
        accountant.printJobTitle();
    }
}
