package CircularLinkedList;

public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public CLL(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    public void insertEnd(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail= node;
            return;
        }

        tail.next = node;
        node.next=head;
        tail=node;
    }

    public void display(){
        Node temp = head;
        if(head == tail){
            System.out.println("Null");
        }
        while(temp!=tail){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println(tail.value + "->HEAD");
    }



    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
