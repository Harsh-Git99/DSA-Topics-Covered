package SinglyLinkedList.kunalSLL.NthNode;

import SinglyLinkedList.kunalSLL.CycleQuestions;
import SinglyLinkedList.kunalSLL.SLL;

public class LL_NthNodeRemoval {
    public ListNode head;
    private ListNode tail;

    private int size;


    public LL_NthNodeRemoval(){
        this.size=0;
    }
}

    public class ListNode {
       public int value;
       public static ListNode next;

        public ListNode() {
        }

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
    }

        public void insertFirstIndex(int val) {

            //first create a new NODE with value = val;

            ListNode node = new ListNode(val);

            // point the next of this new Node to Head.
            ListNode.next =
            head = node;        //also now that new node is headNode
            if (tail == null) {     //check if the linkedList have only one node
                tail = head;     // if yes, then both head and tail will point to the first node
            }

        }

        public void insertLastIndex(int val) {

            if (tail == null) {
                insertFirstIndex(val);
                return;
            }

            SLL.Node node = new SLL.Node(val);
            tail.next = node;       //tails next was null and not its pointing to the new node,
            tail = node;          //now new node is tail
            size++;
        }
        public ListNode removeNthFromEnd(ListNode head, int n) {


            if(n==0){
                return head;
            }
            if(n==1){
                if(head==null || head.next == null){
                    return null;
                }
            }
            ListNode temp = head;
            int count=0;

            while(temp.next != null){
                count++;
                temp=temp.next;
            }
            int prev = Math.abs(count - n);

            if(prev == 0){
                head.next = null;
                return head;
            }
            ListNode node = head;
            for(int i = 0; i <= prev; i++ ){
                node=node.next;
            }
            if(node.next != null){
                node.next = node.next.next;
                return head;
            }else
                return head;
        }

        public void main(String[] args) {
            ListNode list = new ListNode();
            ListNode head = null;


        }
}
