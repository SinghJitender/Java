package DataStructures.CircurlarLinkedList;

import DataStructures.LinkedList.Node;

public class CircularLinkedList<T> {
    private Node head=null;

    public CircularLinkedList() {   }

    public void addAtStart(T value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            node.setNode(head);
            return;
        }
        Node temp = head;
        while(temp.nextNode() != head) {
            temp = temp.nextNode();
        }
        temp.setNode(node);
        node.setNode(head);
        head=node;
    }

    public void addAtEnd(T value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            node.setNode(head);
            return;
        }
        Node temp = head;
        while(temp.nextNode() != head) {
            temp = temp.nextNode();
        }
        temp.setNode(node);
        node.setNode(head);
    }

    public void print(){
        Node temp = head;
        while(true) {
            System.out.print(temp.getValue()+ " -> ");
            temp = temp.nextNode();
            if(temp==head){
                break;
            }
        }
        System.out.println("null");
    }


}
