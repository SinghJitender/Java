package DataStructures.Queue;

import DataStructures.LinkedList.Node;

public class Queue<T> {
    private Node front=null;
    private Node back=null;

    public Queue() {}

    public void enqueue(T value) {
        Node node = new Node(value);
        if(front==null) {
            front = node;
        }
        if(back==null){
            back=node;
            return;
        }
        back.setNode(node);
        back=node;
    }

    public void dequeue() {
        if(front==null) {
            System.out.println("Queue Empty");
            return;
        }
        Node temp = front.nextNode();
        front=null;
        front=temp;
    }

    public void print() {
        Node temp = front;
        while(temp != null){
            System.out.print(temp.getValue()+" -> ");
            temp=temp.nextNode();
        }
        System.out.println("null");

    }

}
