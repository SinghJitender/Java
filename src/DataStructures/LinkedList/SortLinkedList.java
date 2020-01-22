package DataStructures.LinkedList;

import java.sql.SQLOutput;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("E");
        list1.add("F");
        list1.add("R");
        list1.add("Z");
        list1.add("A");

        System.out.print("Unsorted List : ");
        list1.print();

        list1.sort();

        System.out.print("Sorted List : ");
        list1.print();


        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(40);
        list.add(20);
        list.add(30);
        list.add(90);
        list.add(80);

        System.out.print("Unsorted List : ");
        list.print();

        list.sort();

        System.out.print("Sorted List : ");
        list.print();
        list.add(100);

        System.out.println("Adding 100");
        list.print();

    }
}
