package com.company;

public class Main {

    public static void main(String[] args) {

        Library library = new Library(1, "Chyngyz Aytmatov",
                new Book[]{
                        new Book(1, "Jamila", 120, 1990, "Chyngyz Aytmatov"),
                        new Book(2, "Ak keme", 200, 2005, "Chyngyz Aytmatov"),
                        new Book(3, "Hello", 300, 2001, "James Brain")
                }
        );

        // add book
        library.addBook(new Book(5, "new book", 122, 2009, "author"));

        for (Book book : library.getAllLibraryBooks()) {
            System.out.println(book);
        }

//        // get book
//        System.out.println(library.getBook(2));
//
//        // update
//        System.out.println(library.updateBook(1, new Book(9, "nn", 122111, 90, "hi")));
    }
}
