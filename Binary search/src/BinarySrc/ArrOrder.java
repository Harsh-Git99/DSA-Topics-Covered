package BinarySrc;

//to know that the given Sorted array is in Ascending or Descending order
public class ArrOrder {
    public static void main(String[] args) {

        int[] arr = {1,1,3,5,8,9,10,12,23,46};

        //int[]ar = {50,45,40,35,30,25,20,15,10,5};

        whichOrder(arr);

        //whichOrder(ar);
    }

    static void whichOrder(int [] ar){

        int start=0;
        int end = ar.length-1;
        if (ar[start] > ar[end] ){
            System.out.println("The array is in descending order");
        }else {
            System.out.println("The array is in ascending order");
        }
    }
}
