package DataStructures.LinkedList;

import java.util.Objects;

public class Node<T> {
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
}
