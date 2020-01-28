package DataStructures.Queue.PriorityQueue;

public class PriorityQueue {
    private PriorityQueueNode front = null;

    public PriorityQueue() {
    }

    public void insert(int value, int priority) {
        PriorityQueueNode node = new PriorityQueueNode(value,priority);
        System.out.println("Adding : "+ value + " with priority : "+priority);
        if(front == null) {
            front = node;
            return;
        }
        if(priority < front.getPriority()) {
            node.setNext(front);
            front = node;
            return;
        }
        PriorityQueueNode temp = front;
        PriorityQueueNode prev = null;
        while(temp != null) {
            if(priority < temp.getPriority() ) {
                prev.setNext(node);
                node.setNext(temp);
                return;
            }
            if(temp.getNext() == null) {
                temp.setNext(node);
                return;
            }
            prev=temp;
            temp = temp.getNext();
        }
       return;
    }

    public void insert(int value){
        insert(value,Integer.MAX_VALUE);
    }

    public void print() {
        PriorityQueueNode temp = front;
        while(temp != null) {
            System.out.print(temp+ "  ->  ");
            temp = temp.getNext();
        }
        System.out.println(" null ");
    }

    public PriorityQueueNode deleteMin(){
        PriorityQueueNode temp = front;
        front = front.getNext();
        return temp;
    }

    public PriorityQueueNode getMinimum(){
        return front;
    }

    public PriorityQueueNode deleteMax(){
        PriorityQueueNode temp = front;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        PriorityQueueNode deletedNode = temp.getNext();
        temp.setNext(null);
        return deletedNode;
    }

    public PriorityQueueNode getMaximum(){
        PriorityQueueNode temp = front;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

}
