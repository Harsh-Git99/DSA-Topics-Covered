package SinglyLinkedList.Practice;

public class NodeEx1 {
    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5};

    arraysToLinkedList(arr);

    }

    static void arraysToLinkedList(int [] arr){
        SLL_ex1 list = new SLL_ex1();
        for (int i = 0; i < arr.length; i++) {

            list.insertArrayAtLast(arr[i]);

        }

        list.displayList();
    }

}
