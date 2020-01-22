package DataStructures.LinkedList;

import java.util.Comparator;
import java.util.Objects;

public class Node<T> implements Comparable<T> {
    private Node next=null;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public Node nextNode() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNode(Node node) {
        this.next = node;
    }

    @Override
    public String toString() {
        return "Node{" +
                "node=" + next +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return next.equals(node.next) &&
                value.equals(node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, value);
    }

    @Override
    public int compareTo(T t) {
       if(t instanceof String) {
           return ((String) this.value).compareTo((String)t);
       }
       else if(t instanceof Integer) {
           return ((Integer) this.value).compareTo((Integer) t);
       }
       else return 0;
    }
}
