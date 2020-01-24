package DataStructures.BinaryTree;

import java.util.Objects;

public class TreeNode<T> implements Comparable<T> {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TreeNode<?> treeNode = (TreeNode<?>) o;
    return Objects.equals(value, treeNode.value) ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public int compareTo(T t) {
     if(t instanceof String) {
       return this.getValue().toString().compareTo(t.toString());
    } else if(t instanceof Integer) {
       return  ((Integer)this.getValue()) - (Integer)t;
     }
     else{
       return 0;
     }
  }
}
