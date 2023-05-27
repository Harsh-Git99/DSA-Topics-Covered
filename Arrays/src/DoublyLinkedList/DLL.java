package DoublyLinkedList;

public class DLL {

    public Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null) head.prev = newNode;
        head = newNode;

    }

    public void insertLast(int val){

        Node node = new Node(val);

        if(head == null){

            node.prev = null;
            node.next = null;
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void insertAtIndex(int val, int index){
        if(index == 0){
            insertFirst(val);
        }

        Node node = new Node(val);

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node dummy = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null){
            node.next = dummy;
            dummy.prev = node;
        }

    }


    public void displayFromFirst (){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void displayReverse(){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("Start");

    }

    private class Node{
        private int value;

        private Node next;
        private Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
