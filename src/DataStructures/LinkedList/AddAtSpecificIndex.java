package DataStructures.LinkedList;

public class AddAtSpecificIndex {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(80);
        linkedList.add(70);
        linkedList.add(60);
        linkedList.add(30);
        linkedList.add(40);

        linkedList.print();

        linkedList.add(20,3);

        linkedList.print();

        linkedList.add(130,0);

        linkedList.print();

        linkedList.add(190,15);

        linkedList.print();

        linkedList.add(190,-2);

        linkedList.print();
    }
}
