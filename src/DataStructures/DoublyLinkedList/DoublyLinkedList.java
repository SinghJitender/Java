package DataStructures.DoublyLinkedList;

public class DoublyLinkedList<T> {
    private DoublyLinkedListNode start= null;
    private DoublyLinkedListNode end = null;

    public DoublyLinkedList() {
    }

    public void addAtBeginning(T value) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(value);
        if(start == null && end==null){
            node.setPrevious(null);
            node.setNext(null);
            start = node;
            end = node;
            return;
        }
        start.setPrevious(node);
        node.setPrevious(null);
        node.setNext(start);
        start=node;
        return;
    }

    public void addAtEnd(T value) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(value);
        if(start == null && end==null){
            node.setPrevious(null);
            node.setNext(null);
            start = node;
            end = node;
            return;
        }
        end.setNext(node);
        node.setPrevious(end);
        node.setNext(null);
        end=node;
        return;
    }

    public void addAtIndex(T value, int index){
        DoublyLinkedListNode temp = start;
        int currindex=0;
        while(index != currindex) {
            currindex++;
            if(temp.getNext()==null){
                System.out.println("Reached end of list. Adding element at the end");
                break;
            }
            temp=temp.getNext();
        }
        DoublyLinkedListNode node = new DoublyLinkedListNode(value);
        if(temp == start){
            node.setNext(temp);
            temp.setPrevious(node);
            start = node;
            return;
        }
        if(temp == end){
            node.setPrevious(temp);
            temp.setNext(node);
            end = node;
            return;
        }

        temp.getPrevious().setNext(node);
        node.setPrevious(temp.getPrevious());
        node.setNext(temp);
        temp.setPrevious(node);

        return;
    }

    public void printFromStart(){
        DoublyLinkedListNode temp = start;
        while(temp!=null){
            System.out.print(temp.getValue()+" -> ");
            temp=temp.getNext();
        }
        System.out.println(" null");
    }

    public void printFromEnd(){
        DoublyLinkedListNode temp = end;
        while(temp!=null){
            System.out.print(temp.getValue()+" -> ");
            temp=temp.getPrevious();
        }
        System.out.println(" null");
    }
    
}
