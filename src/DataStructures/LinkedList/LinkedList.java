package DataStructures.LinkedList;

public class LinkedList<T> {
    private Node head;
    private Node current;

    public LinkedList() {
    }

    public void add(T value){
        Node node = new Node(value);
        if(head == null) {
            head=node;
            current=node;
        } else {
           current.setNode(node);
           current=node;
        }
    }

    public void print(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getValue()+" -> ");
            temp = temp.nextNode();
        }
        System.out.println("null");
    }

    public void remove(T value) {
        Node temp = head;
        boolean flag = true ;
        while(temp.nextNode() != null) {
            if(temp.nextNode().getValue() == value) {
                temp.setNode(temp.nextNode().nextNode());
                flag=false;
                break;
            }
            temp = temp.nextNode();
        }
        if(flag) {
            System.out.println("No such element with value = ["+value+"] found.");
        }
    }

    public void reverse() {
        Node prev = null;
        Node next = null;
        Node curr = head;
        current=head;
        while ( curr != null ) {
            next = curr.nextNode();
            curr.setNode(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }

}
