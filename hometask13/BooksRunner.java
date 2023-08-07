package hometask13;

import java.io.*;

public class BooksRunner {
    public static void main(String[] args) {
        Author author = new Author("J.K.", "Rowling");
        Book book = new Book("Harry Potter and the Philosopher's Stone", author, 223);

        // Serialize the book object to a file
        try {
            FileOutputStream fileOut = new FileOutputStream("hometask13/book.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(book);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in hometask13/book.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the book object from the file
        Book deserializedBook = null;
        try {
            FileInputStream fileIn = new FileInputStream("hometask13/book.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedBook = (Book) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Print the deserialized book object to the console
        if (deserializedBook != null) {
            System.out.println("Deserialized Book:");
            System.out.println("Title: " + deserializedBook.getTitle());
            System.out.println("Author: " + deserializedBook.getAuthor().getName() + " " + deserializedBook.getAuthor().getSurname());
            System.out.println("Number of pages: " + deserializedBook.getNumPages());
        }
    }
}
