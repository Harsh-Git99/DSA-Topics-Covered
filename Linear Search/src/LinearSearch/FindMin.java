package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int [] arr = {856,4,55,67,85,3433,785,1};

         minNum(arr);
    }

     static void minNum(int[] arr) {
         int elem = arr[0] ;
         for (int i = 1; i < arr.length; i++) {

             if (elem > arr[i]){
                 elem = arr[i];
             }

         }
         System.out.println("The min value in array is "+elem);
    }
}
