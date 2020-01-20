package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");
        linkedList.add("G");
        linkedList.add("H");
        linkedList.print();
        linkedList.deleteMiddleElement();

        System.out.println("\n\n\n");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("A");
        linkedList2.add("B");
        linkedList2.add("C");
        linkedList2.add("D");
        linkedList2.add("E");
        linkedList2.add("F");
        linkedList2.add("G");
        linkedList2.print();
        linkedList2.deleteMiddleElement();

        System.out.println("\n\n\n");

        LinkedList<String> linkedList3 = new LinkedList<>();
        linkedList3.add("A");
        linkedList3.print();
        linkedList3.deleteMiddleElement();

        System.out.println("\n\n\n");

        LinkedList<String> linkedList4 = new LinkedList<>();
        linkedList4.add("A");
        linkedList4.add("B");
        linkedList4.print();
        linkedList4.deleteMiddleElement();
        linkedList4.add("C");
        linkedList4.print();

        System.out.println("\n\n\n");

        LinkedList<String> linkedList5 = new LinkedList<>();
        linkedList5.add("A");
        linkedList5.add("B");
        linkedList5.add("C");
        linkedList5.print();
        linkedList5.deleteMiddleElement();
        linkedList5.add("D");
        linkedList5.add("E");
        linkedList5.add("F");
        linkedList5.print();
        linkedList5.remove(4);
        linkedList5.add("G");
        linkedList5.print();

        System.out.println("\n\n\n");

        LinkedList<String> linkedList6 = new LinkedList<>();
        linkedList6.add("A");
        linkedList6.add("B");
        linkedList6.add("C");
        linkedList6.add("D");
        linkedList6.add("E");
        linkedList6.add("F");
        linkedList6.add("G");
        linkedList6.print();
        linkedList6.deleteMiddleElementOptimized();
        linkedList6.print();
        linkedList6.deleteMiddleElementOptimized();
        linkedList6.print();

        System.out.println("\n\n\n");

        LinkedList<String> linkedList7 = new LinkedList<>();
        linkedList7.add("A");
        linkedList7.add("B");
        linkedList7.print();
        linkedList7.deleteMiddleElementOptimized();
        linkedList7.print();



    }
}
