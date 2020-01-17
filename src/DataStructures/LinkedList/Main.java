package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        linkedList.print();
       // linkedList.remove("C");

      //  linkedList.remove("O");

        linkedList.reverse();
       // linkedList.print();
        linkedList.add("F");
        linkedList.add("G");
        linkedList.add("H");
        linkedList.print();

    }
}
