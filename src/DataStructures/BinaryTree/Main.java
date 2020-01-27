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

        System.out.print("Inorder traversal of tree : ");
        tree.inOrderTraversal();

        //System.out.println("Root : "+ tree.getRoot().getValue());

        System.out.print("Preorder traversal of tree : ");
        tree.preOrderTraversal();

        System.out.print("Postorder traversal of tree : ");
        //System.out.println("Root : "+ tree.getRoot().getValue());

        tree.postOrderTraversal();

        //System.out.println("Root : "+ tree.getRoot().getValue());

        System.out.print("Level Order traversal of tree : ");
        tree.levelOrderTraversal();

        System.out.println("\nSearch in tree : "+3);
        tree.search(3);

        System.out.println("Search in tree : "+ 23);
        tree.search(23);
    }
}
