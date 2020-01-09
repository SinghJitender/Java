package DataStructures;

public class Node {
  private int data;
  private Node node;

  public Node(int data, Node node) {
    this.data = data;
    this.node = node;
  }

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data=" + data +
      ", node=" + node +
      '}';
  }
}
