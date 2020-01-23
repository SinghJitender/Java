package DataStructures.CircurlarLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.addAtStart(10);
        circularLinkedList.addAtStart(20);
        circularLinkedList.addAtStart(30);
        circularLinkedList.addAtStart(40);
        circularLinkedList.addAtStart(50);
        circularLinkedList.addAtEnd(60);
        circularLinkedList.print();

    }
}
