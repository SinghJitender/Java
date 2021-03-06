package DataStructures.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();



        System.out.println(doublyLinkedList.isEmpty());
        doublyLinkedList.addAtBeginning(10);
        doublyLinkedList.addAtEnd(20);
        doublyLinkedList.addAtEnd(30);
        doublyLinkedList.addAtEnd(40);
        doublyLinkedList.printFromStart();
        doublyLinkedList.addAtBeginning(50);
        doublyLinkedList.printFromStart();
        System.out.println(doublyLinkedList.size());
        //doublyLinkedList.printFromEnd();

        doublyLinkedList.addAtIndex(100,0);
        doublyLinkedList.addAtIndex(160,5);
        doublyLinkedList.printFromStart();

        doublyLinkedList.deleteFromBeginning();
        doublyLinkedList.printFromStart();

        doublyLinkedList.deleteFromEnd();
        doublyLinkedList.printFromStart();
        System.out.println(doublyLinkedList.size());

        doublyLinkedList.deleteAtIndex(2);
        doublyLinkedList.printFromStart();

        System.out.println(doublyLinkedList.isEmpty());
        System.out.println(doublyLinkedList.size());

        for(int i=0;i<doublyLinkedList.size();i++){
            System.out.println(doublyLinkedList.get(i).getValue());
        }

    }
}
