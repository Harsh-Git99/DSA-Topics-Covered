package SinglyLinkedList.Practice;

public class SLL_ex1 {


    private Node head = null;
    private  Node tail = null;

    private int size;
    public SLL_ex1() {
        this.size = 0;
    }

    public  void insertArrayAtFirstPlace(int val){
        Node newNode = new Node(val);
        newNode.next = head;        //as the value od the head in the beginning is null
        head = newNode;             // Now, head value is the value of the newNode

        if(tail == null){           //if there is only one Node then the head and the tail point to the same NODE
            tail=head;
        }
        size++;
    }
    public  void insertArrayAtLast(int val){
        Node newNode = new Node(val);
        if(tail==head){
            insertArrayAtFirstPlace(val);
            return;
        }
        tail.next = newNode ;
        tail = newNode ;
        newNode.next = null;
        size++;
    }

    public void displayList(){
        Node temp = head;

        while(tail!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
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
