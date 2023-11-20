package com.company;

import java.util.Arrays;

public class Library {

    private int id;
    private String name;
    private Book[] books;

    public Library(int id, String name, Book[] books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public void addBook(Book book) {

        // version 1
//        Book[] books1 = Arrays.copyOf(books, books.length + 1);
//        books1[books1.length - 1] = book;
//        this.books = books1;

        //version 2
        Book[] books2 = Arrays.copyOf(books, books.length + 1);
        books2[books2.length - 1] = book;
        this.books = books2;

        System.out.println("New book successfully added!");
    }

    public Book getBook(int bookId) {
        for (Book book : this.books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public Book updateBook(int id, Book newBook) {

        for (Book book : this.books) {

            if (book.getId() == id) {
                book.setAuthorName(newBook.getAuthorName());
                book.setName(newBook.getName());
                book.setPublishedYear(newBook.getPublishedYear());
                return book;
            }
        }
        return null;
    }

    public void deleteBook(int id) {

        Book[] books1 = new Book[books.length - 1];

        for (int i = 0; i < books.length; i++) {

            if (books[i].getId() == id) {
                books[i] = null;
            }
        }
    }

    public Book[] getAllLibraryBooks() {

        return this.books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
