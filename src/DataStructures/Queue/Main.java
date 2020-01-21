package DataStructures.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10); queue.enqueue(50); queue.enqueue(30); queue.enqueue(20); queue.enqueue(15);

        queue.print();

        queue.enqueue(60);

        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.print();



    }
}
