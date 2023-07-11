package library;

public class Book {
    private String name;
    private String author;
    private static String libraryName = "Национальная библиотека";

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public static String getLibraryName() {
        return libraryName;
    }

    public static void setLibraryName(String libraryName) {
        Book.libraryName = libraryName;
    }

    public void printLibraryName() {
        System.out.println("Все книги принадлежат: " + libraryName);
    }
}
