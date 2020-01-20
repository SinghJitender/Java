package DataStructures.LinkedList;

public class CopyTwoLinkedLists {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");

        System.out.print("List 1 : " );  list1.print();

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("F");
        list2.add("G");

        System.out.print("List 2 : " );  list2.print();

        list1.addAll(list2,2);
        System.out.print("List 1 Now : " );  list1.print();
        System.out.print("List 2 Now : " );  list2.print();
    }
}
