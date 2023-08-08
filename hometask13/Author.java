package hometask13;

import java.io.Serializable;

public class Author implements Serializable {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
