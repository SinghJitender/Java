package DataStructures.DoublyLinkedList;

import DataStructures.LinkedList.Node;

public class DoublyLinkedList<T> {
    private DoublyLinkedListNode start= null;
    private DoublyLinkedListNode end = null;
    private int SIZE = 0;

    public DoublyLinkedList() {
    }

    public void addAtBeginning(T value) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(value);
        if(start == null && end==null){
            node.setPrevious(null);
            node.setNext(null);
            start = node;
            end = node;
            SIZE=SIZE+1;
            return;
        }
        start.setPrevious(node);
        node.setPrevious(null);
        node.setNext(start);
        start=node;
        SIZE=SIZE+1;
        return;
    }

    public void addAtEnd(T value) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(value);
        if(start == null && end==null){
            node.setPrevious(null);
            node.setNext(null);
            start = node;
            end = node;
            SIZE=SIZE+1;
            return;
        }
        end.setNext(node);
        node.setPrevious(end);
        node.setNext(null);
        end=node;
        SIZE=SIZE+1;
        return;
    }

    public void addAtIndex(T value, int index){
        DoublyLinkedListNode temp = start;
        int currindex=0;
        while(index != currindex) {
            currindex++;
            if(temp.getNext()==null){
                System.out.println("Reached end of list. Adding element at the end");
                break;
            }
            temp=temp.getNext();
        }
        DoublyLinkedListNode node = new DoublyLinkedListNode(value);
        if(temp == start){
            node.setNext(temp);
            temp.setPrevious(node);
            start = node;
            SIZE=SIZE+1;
            return;
        }
        if(temp == end){
            node.setPrevious(temp);
            temp.setNext(node);
            end = node;
            SIZE=SIZE+1;
            return;
        }

        temp.getPrevious().setNext(node);
        node.setPrevious(temp.getPrevious());
        node.setNext(temp);
        temp.setPrevious(node);
        SIZE=SIZE+1;
        return;
    }

    public void printFromStart(){
        DoublyLinkedListNode temp = start;
        while(temp!=null){
            System.out.print(temp.getValue()+" -> ");
            temp=temp.getNext();
        }
        System.out.println(" null");
    }

    public void printFromEnd(){
        DoublyLinkedListNode temp = end;
        while(temp!=null){
            System.out.print(temp.getValue()+" -> ");
            temp=temp.getPrevious();
        }
        System.out.println(" null");
    }

    public void deleteFromBeginning(){
        DoublyLinkedListNode temp = start;
        start = start.getNext();
        start.setPrevious(null);
        temp = null;
        SIZE=SIZE-1;
        return;
    }

    public void deleteFromEnd(){
        DoublyLinkedListNode temp = end;
        end = end.getPrevious();
        end.setNext(null);
        temp = null;
        SIZE=SIZE-1;
        return;
    }

    public void deleteAtIndex(int index) {
        int currindex=0;
        DoublyLinkedListNode temp = start;
        while(currindex != index) {
            currindex++;
            if(temp.getNext() == null){
                System.out.println("Index not found");
                return;
            }
            temp = temp.getNext();
        }
        if(temp == start) {
            deleteFromBeginning();
            return;
        }
        if(temp == end) {
            deleteFromEnd();
            return;
        }
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        temp=null;
        SIZE=SIZE-1;
        return;

    }

    public boolean isEmpty(){
        return (start==null && end==null);
    }

    public int size(){
        return SIZE;
    }

    public DoublyLinkedListNode get(int index){
        DoublyLinkedListNode temp = start;
        int currentindex=0;
        while(currentindex != index) {
            if(temp.getNext() == null) {
                throw new IndexOutOfBoundsException(index);
            }
            currentindex++;
            temp=temp.getNext();
        }
        return temp;
    }

}
