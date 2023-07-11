package library;

public class LibraryRunner {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В. В.", 1);
        readers[1] = new Reader("Иванов И. И.", 2);
        readers[2] = new Reader("Сидоров С. С.", 3);


        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].takeBook(new Book("Книга 1", "Автор 1"), new Book("Книга 2", "Автор 2"), new Book("Книга 3", "Автор 3"));

        System.out.println("Количество взятых книг: " + Reader.booksTaken[0]);
        System.out.println("Количество взятых книг по названию: " + Reader.booksTaken[1]);
        System.out.println("Количество взятых книг по объектам: " + Reader.booksTaken[2]);

        new Book("Книга", "Автор").printLibraryName();
    }

}

