package SinglyLinkedList.kunalSLL;

public class CycleQuestions {

    class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    //find if list is Cycle or not
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }


    // find length of the cycle
    public int cycleLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode temp = slow.next;  //if we keep temp == slow the while loop will not run
                int count = 1;        //we have started count from 1 as we are skipping the slow node
                while (temp != fast) {
                    temp = temp.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }

    //Find the start node from where the cycle begins

    public ListNode cycleStart(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        ListNode start = head;
        ListNode end = head;
        int count = 0;
        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
            if (pointer1 == pointer2) {
                ListNode temp = pointer1;
                do {
                    temp = temp.next;
                    count++;
                } while (temp != pointer1);
                break;
            }
        }
        if (count == 0) {
            return null;
        }
        while (count > 0) {
            end = end.next;
            count--;
        }
        while (start != end) {
            start = start.next;
            end = end.next;
        }
        return start;
    }


    //Happy Number
    private int square(int val) {

        int square = 0;
        while (val != 0) {
            int rem = val % 10;
            square += rem * rem;
            val = val / 10;
        }
        return square;
    }

    public boolean happyNumber(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }


//Middle of the linkedList

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}



     //Remove Nth Node From End of List

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



 }
