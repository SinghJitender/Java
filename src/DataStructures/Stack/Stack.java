package DataStructures.Stack;

import DataStructures.LinkedList.Node;

public class Stack<T> {
    Node top=null;

    public Stack(){ }

    public void push(T value){
        Node node = new Node(value);
        if(top==null) {
            top=node;
            return;
        }
        Node temp = top;
        top = node;
        node.setNode(temp);
    }

    public void pop(){
        if(top==null) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Popping Element ["+top.getValue()+"]");
        Node temp = top.nextNode();
        top = temp;
    }

    public void print() {
        Node temp = top;
        while(temp != null) {
            System.out.print(temp.getValue()+ " -> ");
            temp=temp.nextNode();
        }
        System.out.println("null");
    }
}
