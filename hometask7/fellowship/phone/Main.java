package hometask7.fellowship.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("7780-3535", "Nokia", 0.2);
        Phone phone2 = new Phone("8800-5355", "iPhone");
        Phone phone3 = new Phone();

        phone3.getInfo();
        phone2.getInfo();
        phone1.getInfo();

        phone1.receiveCall("Alex");
        phone2.receiveCall("Nick", "2222-3333");
        phone3.receiveCall("Bob");

        System.out.println("Phone 1 number: " + phone1.getNumber());
        System.out.println("Phone 2 number: " + phone2.getNumber());
        System.out.println("Phone 3 number: " + phone3.getNumber());

        phone3.sendMessage("7780-3535", "8800-5355", "2222-3333");
    }
}
