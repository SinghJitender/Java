package CoreJava;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ComparableJava {

    public static void main(String[] args) {

        Book book2 = new Book("Art of war","Prachi",20,9);
        Book book1 = new Book("Corporate Chanakya","Jitender",10,100);
        Book book3 = new Book("Chanakayaniti","Sukhi",50,50);
        Book book4 = new Book("Revolution 2020","Adi",20,140);
        Book book5 = new Book("Indus Valley","Amit",10,105);
        Book book6 = new Book("Living in 3030","Jitendar",10,100);
        Book book7 = new Book("Stock Market","Jitender",20,100);
        List<Book> bookCollection = Arrays.asList(book1,book2,book3,book4,book5,book6,book7);

        Consumer<Collection> consumer = c -> bookCollection.stream().forEach(book -> System.out.println(book));

        System.out.println("Unsorted Books Collections : ");
        consumer.accept(bookCollection);

        Collections.sort(bookCollection);


        System.out.println("\n\nSorted by price");
        Collections.sort(bookCollection, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice()>=o2.getPrice()?1:-1;
            }
        });
        consumer.accept(bookCollection);

        System.out.println("\n\nSorted by stock");
        Collections.sort(bookCollection, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getStock()>=o2.getStock()?1:-1;
            }
        });
        consumer.accept(bookCollection);

        System.out.println("\n\nSorted by price then stock");
        Collections.sort(bookCollection, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.getPrice()==o2.getPrice()){
                   if(o1.getStock()>=o2.getStock()){
                       return 1;
                   }
                   else
                       return -1;
                }else{
                    return o1.getPrice()>o2.getPrice()?1:-1;
                }

            }
        });
        consumer.accept(bookCollection);

        System.out.println("\n\nSorted by price then stock then author name");
        Collections.sort(bookCollection, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.getPrice()==o2.getPrice()){
                    if(o1.getStock()==o2.getStock()){
                        return o1.getAuthor().compareTo(o2.getAuthor());
                    }
                    else
                        return o1.getStock()>o2.getStock()?1:-1;
                }else{
                    return o1.getPrice()>o2.getPrice()?1:-1;
                }

            }
        });
        consumer.accept(bookCollection);
    }
}
