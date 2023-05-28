package SinglyLinkedList.KunalDLL;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size=0;
    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val){
        if(head==null){
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;

        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev = last;
        node.next=null;

    }

    public void insertAtIndex(int val,int index){


        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next,temp);
        node.next= temp.next;
        temp.next = node;
        node.prev= temp;
        if(node.next != null){
            node.next.prev = node;
        }
    }
    public void display(){
        Node temp = head;
        Node last=null;
       while (temp!= null){
           System.out.print(temp.value+"->");
           last=temp;
            temp=temp.next;

        }
       System.out.println("End");

       System.out.println("Reverse Display");
       while(last != null){
            System.out.print(last.value+"->");
            last=last.prev;
       }
        System.out.println("START");
    }

    private class Node{
        private int value;
        private Node next;

        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
