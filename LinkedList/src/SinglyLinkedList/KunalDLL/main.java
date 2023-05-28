package SinglyLinkedList.KunalDLL;

public class main {
    public static void main(String[] args) {
        DLL listDoubly = new DLL();
        listDoubly.InsertFirst(3);
        listDoubly.InsertFirst(4);
        listDoubly.InsertFirst(6);
        listDoubly.InsertFirst(7);
        listDoubly.InsertFirst(1);
        listDoubly.InsertFirst(0);
        listDoubly.InsertFirst(5);



        listDoubly.insertAtIndex(23,1);
        listDoubly.insertLast(4);
        listDoubly.display();
    }


}
