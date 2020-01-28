package DataStructures.Queue.PriorityQueue;

public class PriorityQueueNode {
    private int data;
    private int priority;
    private PriorityQueueNode next = null;

    public PriorityQueueNode(int data, int priority) {
        this.data = data;
        this.priority = priority;
    }

    public PriorityQueueNode(int data) {
        this.data = data;
        this.priority = 10;
    }

    public PriorityQueueNode getNext() {
        return next;
    }

    public void setNext(PriorityQueueNode next) {
        this.next = next;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "PriorityQueueNode{" +
                "data=" + data +
                ", priority=" + priority +
                '}';
    }

}
