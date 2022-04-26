package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book book1 = new Book("Stephen King", "The Stand", "1978");
        fillArrayBooks(books, book1);

        Book book2 = new Book("Александр Сергеевич Пушкин", "Евгений Онегин", "1831");
        fillArrayBooks(books, book2);

        Book book3 = new Book("Александр Сергеевич Пушкин", "Сказка о рыбаке и рыбке", "1833");
        fillArrayBooks(books, book3);

        Book book4 = new Book("Александр Сергеевич Пушкин", "Сказка о царе Салтане", "1831");
        fillArrayBooks(books, book4);

        Book book5 = new Book("Дмитрий Глуховский", "Метро", "2020");
        fillArrayBooks(books, book5);


    }

    public static Book[] fillArrayBooks(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println(books[i]);
                break;
            }
        }
        return books;
    }
}

class Book {
    String author;
    String nameBook;
    String yearPublication;

    public Book(String author, String nameBook, String yearPublication) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return this.nameBook + ": " + this.author + ": " + this.yearPublication;

    }
}

