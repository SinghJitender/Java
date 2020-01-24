package DataStructures.BinaryTree;

public class Tree<T> {
  private TreeNode root = null;

  public Tree() {
  }

  public void add(T value){
   root = addRecursive(root, value);
  }

  private TreeNode addRecursive(TreeNode position ,T value) {
    if(position == null) {
      return new TreeNode(value);
    }
    if(position.compareTo(value)>0) {
      position.setLeft(addRecursive(position.getLeft(),value));
    }
    if(position.compareTo(value)<0) {
      position.setRight(addRecursive(position.getRight(),value));
    }
    return position;
  }

  public void inOrderTraversal() {
    TreeNode node = root;
    traverseInOrder(node);
  }

  private void traverseInOrder(TreeNode node) {
    if(node == null) {
      return;
    }
    traverseInOrder(node.getLeft());
    System.out.println(node.getValue());
    traverseInOrder(node.getRight());
  }

  public TreeNode getRoot() {
    return root;
  }

  public void printTree() {

  }

  private void getNodeData(){

  }

}
