package DataStructures.BinaryTree;

public class TreeNode<T> {
  private T value;
  private TreeNode left = null;
  private TreeNode right = null;

  public TreeNode(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public TreeNode getLeft() {
    return left;
  }

  public TreeNode getRight() {
    return right;
  }

  public void setRight(TreeNode right) {
    this.right = right;
  }

  public void setLeft(TreeNode left) {
    this.left = left;
  }

  @Override
  public String toString() {
    return "TreeNode{" +
      "value=" + value +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}
