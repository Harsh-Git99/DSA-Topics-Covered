package SinglyLinkedList;

public class SLL {

    private Node head;

    private Node tail;

    private int size;

    public SLL() {
        this.size=0;

    }

    public void insertAtFirstPlace(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;

    }

    public void  insertAtLastPlace(int val){
        Node node = new Node(val);      //create a box
        if(tail == null){
            insertAtFirstPlace(val);
            return;
        }
        tail.next=node;     //if tail is already pointing to some value, we need to replace the null value of the tail node with the new node we are inserting.
        tail = node;         // now point the value of tail to the NEW node created as it is the last node now.
        size++;             // increase the size of the list
    }

    public  void insertAsPleased(int val,int  index){
        if(index == 0){
            insertAtFirstPlace(val);
            return;
        }
        if(index == size){
            insertAtLastPlace(val);
            return;
        }
        Node temp =head;

        for (int i = 1; i < index ; i++) {  //as temp is already at the 0th index
            temp=temp.next;                 //this will go till index-1
        }

        Node NewNode = new Node(val, temp.next);

        temp.next = NewNode;

        size++;


    }

    public int deleteFirst(){
        int val = head.value; // to display the deleted value
        head = head.next;
        if(head == null){
            tail=null;
        }

        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node SecondLast = get(size-2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAsPleased(int index){
        if(index ==0){
            return deleteFirst();
        }
        if(index == size-1){
           return deleteLast();
        }
        //Node deteleNode = get(index);
        Node previousNode = get(index-1);

        //int val = deteleNode.value;
        //OR
        int val = previousNode.next.value;
        //previousNode.next = deteleNode.next;
        //OR

        previousNode.next=previousNode.next.next;
        size--;
        return val;

    }

    public Node getNodeByValue(int val){
        Node node = head;
       while(node != null){
            if(node.value == val){
                return node;
            }
            node= node.next;
        }
       return null;
    }


    public Node get(int index){ //it will return the reference pointer to that node
       Node node = head;
        for (int i = 1; i <= index; i++) {
            node=node.next;
        }
        return node;
    }

    public void displayList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    private class Node {
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
