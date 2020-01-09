package DataStructures;

import java.util.stream.IntStream;

public class MainNode {

  public static void main(String[] args) {
    Node node = new Node(10,null);
    Node node2 = new Node(20,node);
    Node node3 = new Node(30,node2);

    Node temp = node3;
    while(true) {
      System.out.println(temp.getData());
      if(temp.getNode()==null){
        break;
      }else{
        temp=temp.getNode();
      }
    }


    NodeHandler handler = new NodeHandler();
    handler.insertNode(10);
    handler.insertNode(50);
    handler.insertNode(90);
    handler.insertNode(20);
    handler.insertNode(60);

    handler.print();

  }
}
