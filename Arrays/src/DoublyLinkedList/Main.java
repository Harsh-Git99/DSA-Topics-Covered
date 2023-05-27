package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(1);

        list.displayFromFirst();
        list.displayReverse();

        list.insertLast(9);
        list.insertLast(11);
        list.insertLast(21);
        list.insertLast(54);
        list.displayFromFirst();

        list.insertAtIndex(99,8);
        list.displayFromFirst();


    }
}
