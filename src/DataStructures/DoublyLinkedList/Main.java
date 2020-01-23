package DataStructures.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.addAtBeginning(10);
        doublyLinkedList.addAtEnd(20);
        doublyLinkedList.addAtEnd(30);
        doublyLinkedList.addAtEnd(40);
        doublyLinkedList.printFromStart();
        doublyLinkedList.addAtBeginning(50);
        doublyLinkedList.printFromStart();
        //doublyLinkedList.printFromEnd();

        doublyLinkedList.addAtIndex(100,0);
        doublyLinkedList.addAtIndex(160,5);
        doublyLinkedList.printFromStart();
    }
}
