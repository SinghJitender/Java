package DataStructures.Queue.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue();
        queue.insert(10,3);
        queue.insert(50,2);
        queue.insert(70,1);
        queue.insert(60,2);
        queue.insert(90,1);
        queue.insert(25,9);
        queue.insert(35,10);

        System.out.println("Elements Added");

        queue.print();
        System.out.println("Maximum : " + queue.getMaximum());
        System.out.println("Minimum : " + queue.getMinimum());

        queue.deleteMax();
        System.out.println("Maximum : " + queue.getMaximum());

        queue.deleteMin();
        System.out.println("Minimum : " + queue.getMinimum());

        queue.print();


    }
}
