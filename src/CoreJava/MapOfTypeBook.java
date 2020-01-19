package CoreJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapOfTypeBook {

  public static void main(String[] args) {

    Book book = new Book("Art of war","Prachi",20,9);
    Book book2 = book; //new Book("Art of war 2","Jitu",30,90);
    Map<Book,String>  map = new HashMap<>();
    map.put(book,"ABC");
    System.out.println(map.get(book2));

    String a ="Test";

    System.out.println(a);
    show(a);
    System.out.println(a);

    Book book8 = new Book("Art of war2","Prachi",20,9);
    Book book1 = new Book("Corporate Chanakya","Jitender",10,100);
    Book book3 = new Book("Chanakayaniti","Sukhi",50,50);
    Book book4 = new Book("Revolution 2020","Adi",20,140);
    Book book5 = new Book("Indus Valley","Amit",10,105);
    Book book6 = new Book("Living in 3030","Jitendar",10,100);
    Book book7 = new Book("Stock Market","Jitender",20,100);
    List<Book> bookCollection = Arrays.asList(book1,book2,book3,book4,book5,book6,book7,book8);

    Map<String, Book> collect = bookCollection.stream().collect(Collectors.toMap(b->b.getName(), b -> b));
    System.out.println(collect);

  }

  public static void show(String s) {
    s="MS";
    System.out.println(s);
  }
}
