package hometask7.fellowship.phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("", "", 0);
    }

    public void receiveCall(String callerName) {
        System.out.println("Calling " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Calling " + callerName + " " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Sending messages to: " + Arrays.toString(phoneNumbers));
    }

    public void getInfo() {
        System.out.println("Info about Phone: ");
        System.out.println("Number: " + number);
        System.out.println("Model: " + model);
        System.out.println("weight: " + weight);
    }

}
