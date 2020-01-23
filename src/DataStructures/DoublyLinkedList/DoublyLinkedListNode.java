package DataStructures.DoublyLinkedList;

public class DoublyLinkedListNode<T> {
    private final T value;
    private DoublyLinkedListNode next = null;
    private  DoublyLinkedListNode previous = null;

    public DoublyLinkedListNode(T value) {
        this.value = value;
    }

    public void setNext(DoublyLinkedListNode next) {
        this.next = next;
    }

    public void setPrevious(DoublyLinkedListNode previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public DoublyLinkedListNode getNext() {
        return next;
    }

    public DoublyLinkedListNode getPrevious() {
        return previous;
    }
}
