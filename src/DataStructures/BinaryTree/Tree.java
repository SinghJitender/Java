package DataStructures.BinaryTree;

import java.util.ArrayList;

public class Tree<T> {

    private static ArrayList elements = new ArrayList();

    private TreeNode root = null;

    public Tree() {
    }

    public void add(T value) {
        elements.add(value);
        root = addRecursive(root, value);
    }

    private TreeNode addRecursive(TreeNode position, T value) {
        if (position == null) {
            return new TreeNode(value);
        }
        if (position.compareTo(value) > 0) {
            position.setLeft(addRecursive(position.getLeft(), value));
        }
        if (position.compareTo(value) < 0) {
            position.setRight(addRecursive(position.getRight(), value));
        }
        return position;
    }

    public void inOrderTraversal() {
        TreeNode node = root;
        traverseInOrder(node);
        System.out.println();
    }

    private void traverseInOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        traverseInOrder(node.getLeft());
        System.out.print(node.getValue() + " ");
        traverseInOrder(node.getRight());
    }

    public TreeNode getRoot() {
        return root;
    }

    public void preOrderTraversal() {
        traverseInPreOrder(root);
        System.out.println();
    }

    private void traverseInPreOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.getValue() + " ");
        traverseInPreOrder(node.getLeft());
        traverseInPreOrder(node.getRight());
    }

    public void postOrderTraversal() {
        traverseInPostOrder(root);
        System.out.println();
    }

    private void traverseInPostOrder(TreeNode node) {
        if (node == null)
            return;
        traverseInPreOrder(node.getLeft());
        traverseInPreOrder(node.getRight());
        System.out.print(node.getValue() + " ");
    }

    public void levelOrderTraversal() {
        ArrayList<TreeNode> list = new ArrayList<>();
        list.add(root);
        traverseInLevelOrder(list);

    }

    private void traverseInLevelOrder(ArrayList<TreeNode> list) {
        ArrayList<TreeNode> tempList = new ArrayList<>();
        for (TreeNode node : list) {
            if (node == null) {
                continue;
            }
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null)
                tempList.add(node.getLeft());
            if (node.getRight() != null)
                tempList.add(node.getRight());
        }
        if (tempList.size() == 0) {
            return;
        }
        traverseInLevelOrder(tempList);
    }

    public void search(T value) {
        if (elements.contains(value)) {
            System.out.println("Element found in tree.");
        } else {
            System.out.println("Element not found.");
        }
    }
}
