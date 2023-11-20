package com.company;

public class Book {

    private int id;
    private String name;
    private int price;
    private int publishedYear;
    private String authorName;

    public Book(int id, String name, int price, int publishedYear, String authorName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publishedYear = publishedYear;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publishedYear=" + publishedYear +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
