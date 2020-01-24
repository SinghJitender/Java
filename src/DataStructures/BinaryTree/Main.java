package DataStructures.BinaryTree;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.add(10);
        tree.add(6);
        tree.add(12);
        tree.add(4);
        tree.add(7);
        tree.add(11);
        tree.add(23);

        tree.inOrderTraversal();

        System.out.println("Root : "+ tree.getRoot().getValue());
    }
}
