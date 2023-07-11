package library;

public class Reader {
    private String name;
    private int ticketNumber;
    static int[] booksTaken = new int[3];

    public String getName() {
        return name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public Reader(String name, int ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }

    void takeBook(int count) {
        System.out.println(name + " взял " + count + " книги.");
        booksTaken[0] += count;
    }

    public void takeBook(String... booksNames) {
        System.out.println(name + " взял книги: ");
        for (int i = 0; i < booksNames.length; i++) {
            System.out.println(booksNames[i]);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(name + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getName());
        }
        System.out.println();
    }

}
