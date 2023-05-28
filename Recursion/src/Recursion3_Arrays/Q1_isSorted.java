package Recursion3_Arrays;

public class Q1_isSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,4,18,9,12};
        int i = 0;
        System.out.println( isSorted(arr,i));
    }
    //arr in every function call is pointing to the same object

    // Therefore, if in any recursion call you modify the array,
    // the array will be modified for all the other recursion calls
    static  boolean isSorted(int []arr,int i){

            if(i == arr.length-1){
                return true;
            }
            if(arr[i] > arr[i+1]) {
                return false;
            }
            i+=1;
        return isSorted(arr,i);
    }
}


