package SinglyLinkedList.kunalSLL;

public class SLL {

    private ListNode head;
    private ListNode tail;

    private int size;

    public SLL() {
        this.size = 0;
    }

    public void insertFirstIndex(int val) {

        //first create a new NODE with value = val;

        ListNode node = new ListNode(val);

        // point the next of this new Node to Head.
        node.next = head;
        head = node;        //also now that new node is headNode
        if (tail == null) {     //check if the linkedList have only one node
            tail = head;     // if yes, then both head and tail will point to the first node
        }
        size++;
    }

    public void insertLastIndex(int val) {

        if (tail == null) {
            insertFirstIndex(val);
            return;
        }

        ListNode node = new ListNode(val);
        tail.next = node;       //tails next was null and not its pointing to the new node,
        tail = node;          //now new node is tail
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirstIndex(val);
            return;
        }
        if (index == size) {
            insertFirstIndex(val);
            return;
        }
        ListNode temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        ListNode node = new ListNode(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private ListNode insertRec(int val, int index, ListNode node) {
        if (index == 0) {
            ListNode temp = new ListNode(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }


    public int deleteFirst() {

        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        ListNode secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        ListNode prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public ListNode find(int val) {
        ListNode node = head;
        while (node != null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public ListNode get(int index) {         //if we give any index in get(), it will return ref-Pointer to that node
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }


    //questions

    public void deleteDuplicates() {
        ListNode node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //merging two sorted list into a sorted list
    public static void main(String[] args) {
        SLL firstList = new SLL();
        SLL secondList = new SLL();

        firstList.insertLastIndex(1);
        firstList.insertLastIndex(3);
        firstList.insertLastIndex(5);


        secondList.insertLastIndex(1);
        secondList.insertLastIndex(2);
        secondList.insertLastIndex(9);
        secondList.insertLastIndex(14);

       SLL ans = SLL.merge(firstList,secondList);

       ans.display();


    }


    //merge
    public static SLL merge(SLL first, SLL second) {
        ListNode head1 = first.head;
        ListNode head2 = second.head;
        SLL ans = new SLL();
        while (head1.next != null && head2.next != null) {
            if (head1.value < head2.value) {
                ans.insertLastIndex(head1.value);
                head1 = head1.next;
            } else {
                ans.insertLastIndex(head2.value);
                head2 = head2.next;
            }
        }
        while(head1 != null){
            ans.insertLastIndex(head1.value);
            head1=head1.next;
        }
        while(head2 != null){
            ans.insertLastIndex(head2.value);
            head2=head2.next;
        }
        return ans;
    }

    //delete all copies a LinkedList

    static ListNode deleteAllOccurOfX(ListNode head, int x) {
        // Write your code here
        ListNode temp = head;
        while(temp.next != null){
            if(temp.value == x){
                temp.next=temp.next.next;
                temp = temp.next;
            }else{
                temp=temp.next;
            }

        }
        return head;
    }

}
