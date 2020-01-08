package CoreJava;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private int stock;
    private double price;

    public Book(String name, String author, int stock, double price) {
        this.name = name;
        this.author = author;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return getName().compareTo(o.getName());
    }
}
