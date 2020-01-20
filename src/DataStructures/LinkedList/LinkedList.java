package DataStructures.LinkedList;

public class LinkedList<T> {
    private Node head;
    private Node current;

    public LinkedList() {
    }

    public void add(T value){
        Node node = new Node(value);
        if(head == null) {
            head=node;
            current=node;
        } else {
           current.setNode(node);
           current=node;
        }
    }

    public void print(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.getValue()+" -> ");
            temp = temp.nextNode();
        }
        System.out.println("null");
    }

    public void remove(T value) {
        Node temp = head;
        boolean flag = true ;
        while(temp.nextNode() != null) {
            if(temp.nextNode().getValue() == value) {
                temp.setNode(temp.nextNode().nextNode());
                flag=false;
                break;
            }
            temp = temp.nextNode();
        }
        if(flag) {
            System.out.println("No such element with value = ["+value+"] found.");
        }
    }

    public void remove(int index) {
        if(index < 0)
            return;
        Node temp = head;
        Node prev = null;
        int currIndex=0;
        while(temp != null) {
            if(currIndex==index) {
                System.out.println("Deleting Element ["+temp.getValue()+"]");
                if(temp.nextNode() == null) {
                    if(prev == null) {
                        head=null;
                        current=null;
                    } else
                    prev.setNode(null);
                    current=prev;
                } else
                    prev.setNode(temp.nextNode());
                break;
            }
            currIndex++;
            prev = temp;
            temp = temp.nextNode();
        }
        System.out.println("Current now point to Node : "+ current);
        System.out.println("Head now point to Node : "+ head);
    }

    public void reverse() {
        Node prev = null;
        Node next = null;
        Node curr = head;
        current=head;
        while ( curr != null ) {
            next = curr.nextNode();
            curr.setNode(prev);
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public int findMiddle(){
        Node temp = head;
        int count=0;
        while(temp != null) {
            count++;
            temp=temp.nextNode();
        }
        System.out.println("Total Elements :" +count);
        count = count%2==0?(count/2):(count-1)/2;
        return count;
    }

    public void deleteMiddleElement() {
        if(head == null)
            return;
        int middleIndex = findMiddle();
        System.out.println("Index of Middle Element :"+middleIndex);
        remove(middleIndex);
        print();
        //System.out.println("Middle Node is : "+slow.getValue());
    }

    public void deleteMiddleElementOptimized() {
        if(head == null)
            return;
        if(head.nextNode()==null){
            head=null;
            //current=null;
            return;
        }
        Node slow_ptr = head;
        Node fast_ptr=head;
        Node prev=null;
        while(fast_ptr != null && fast_ptr.nextNode() != null) {
            fast_ptr = fast_ptr.nextNode().nextNode();
            prev = slow_ptr;
            slow_ptr=slow_ptr.nextNode();
        }
        System.out.println("Deleting Element ["+slow_ptr.getValue()+"]");
        prev.setNode(slow_ptr.nextNode());
    }

    public void addAll(LinkedList<T> linkedList, int index) {
        int currentIndex=0;
        Node next = head;
        while (currentIndex != index) {
            next = next.nextNode();
            currentIndex++;
        }
        Node end = next.nextNode();
        next.setNode(linkedList.head);
        linkedList.current.setNode(end);
    }

    public void sort(){
        Node i = head;
        while(i != null){
            Node j = i.nextNode();
            while(j != null) {
                if(i.compareTo(j.getValue())>0){
                    T temp = (T) i.getValue();
                    i.setValue(j.getValue());
                    j.setValue(temp);
                }
                j=j.nextNode();
            }
            i=i.nextNode();
        }
    }

}
