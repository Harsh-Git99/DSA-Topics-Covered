package LinkedList;

public class SLL {

    private Node head;
    private Node tail;

    private int size;

    public SLL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next=head;
        head=node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if( tail == null){
            insertFirst(val);
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = node;
        node.next = null;
        size++;
     }

     public  void insertAtIndex(int val, int i){
        Node newNode = new Node(val);

        if(i == 0 ){
            insertFirst(val);
            return;
        }
         if(i == size ){
             insertLast(val);
             return;
         }
         Node temp = head;

             for (int j = 1; j < i; j++) {  //as the temp is already pointing at 0th index
                 temp = temp.next;
             }
             Node dummy =  temp.next;
             temp.next = newNode;
             newNode.next = dummy;
             size++;

     }

     public int deleteFirst(){
        int delVal = head.value;
        head = head.next;

        if(head==null){
            tail=null;
        }
        size--;

        return delVal;
     }

     public int deleteLast(){

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        int delVal = temp.next.value;
        temp.next = null;
        tail = temp;
        if(head == null){
            tail = null;
        }
        size--;
        return delVal;
     }

    public void display(){
        Node temp = head;
        if(head == tail){
            System.out.println(head);
        }

        while (temp != null) {
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("End");
    }



    private class Node{
        private  int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    //questions

    public void duplicates(){

        Node node = head;
        while(node.next != null){
            if( node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else node = node.next;
        }
        tail = node;
        tail.next=null;
    }

    //merge two sorted list
    public static SLL merge( SLL first, SLL second){
        Node node1 = first.head;
        Node node2 = second.head;
        SLL list = new SLL();

        while(node1.next != null || node2.next != null){

            if(node1.value == node2.value){
                list.insertLast(node1.value);
                list.insertLast(node2.value);
                node1=node1.next;
                node2=node2.next;
            }
            else if(node1.value < node2.value){
                list.insertLast(node1.value);
                node1=node1.next;
            }else{
                list.insertLast(node2.value);
                node2=node2.next;
            }
        }

            while(node2 != null){
                list.insertLast(node2.value);
                node2=node2.next;
            }


            while(node1 != null){
                list.insertLast(node1.value);
                node1=node1.next;
            }

        return  list;
    }


    //Next Happy Number
    public static int nextHappy(int N){
        // code here
        do{
            N=N+1;
        }while(!isHappy(N));
        return N;

    }
    public static boolean isHappy(int N){
        int slow = N;
        int fast = N;

        do{
            slow = SumOfSquare(slow);
            fast = SumOfSquare(SumOfSquare(fast));

        }while(slow!=fast);
        if(slow == 1){
            return true;
        }

        return false;
    }

    public static int SumOfSquare(int n){
        int sum=0;
        while(n != 0){
            int rem = n%10;
            sum = sum + rem*rem;
            n = n/10;
        }
        return sum;
    }

    //reverse a LinkedList

    public Node  reverseList(Node head)
    {
        // code here
        Node prev = null;
        Node pres = head;
        Node Next = head.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = Next;
            if(Next.next != null) Next = Next.next;
        }
        return prev;
    }

    public void rotateRight(Node head, int k) {
        if(head == null || head.next == null){
            return ;
        }
        for(int i = 0; i < k; i++){
            Node temp = head;
            while(temp.next!= null && temp.next.next != null){
                temp = temp.next;
            }

            Node dummy = temp.next;
            temp.next = null;
            dummy.next = head;
            head = dummy;
        }

    }



}
