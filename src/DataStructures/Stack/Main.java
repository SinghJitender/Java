package DataStructures.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        //stack.pop();
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(8);
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();

    }
}
