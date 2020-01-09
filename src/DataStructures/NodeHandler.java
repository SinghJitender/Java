package DataStructures;

public class NodeHandler {

  private Node last=null;
  private Node head=null;
  private Node node;

  public NodeHandler(){

  }

  public void insertNode(int data){
    if(last==null){
      Node node = new Node(data);
      head=node;
      last=node;
    } else{
      Node node = new Node(data);
      last.setNode(node);
      last=node;
    }
  }

  public void print(){
    Node temp = head;
    while(temp!=null) {
      System.out.println(temp.getData());
      temp = temp.getNode();
    }
  }
}
