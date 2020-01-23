package DataStructures.BinaryTree;

public class Tree<T> {
  private TreeNode root = null;

  public Tree() {
  }

  public void add(T value){
    TreeNode treeNode = new TreeNode(value);
    if(root==null) {
      root = treeNode;
    }

  }


}
