package SinglyLinkedList;

public class Intro {
    public static void main(String[] args) {
      SLL list = new SLL();

        list.insertAtFirstPlace(2);
        list.insertAtFirstPlace(5);
        list.insertAtFirstPlace(22);
        list.insertAtFirstPlace(25);
        list.insertAtFirstPlace(27);

       // list.displayList();

        list.insertAtLastPlace(4);
        list.insertAtLastPlace(5);
        list.insertAtLastPlace(46);
        list.insertAtLastPlace(47);

        list.insertAsPleased(100,3);
        list.displayList();
      System.out.println( "the first removed value is :"+ list.deleteFirst());
        list.displayList();

      System.out.println( "the last removed value is :"+list.deleteLast());
      list.displayList();

      System.out.println(  list.deleteAsPleased(3));
      list.displayList();

    }
}