package recursion.BasicsChap1;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        //System.out.println(isSorted(arr));
        System.out.println(isSortedRecursive(arr));
    }

    //iterative approach
    static boolean isSorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    // recursive approach

    static boolean isSortedRecursive(int[] arr){
        int i = 1;
        return isSortedHelper(arr,i);
    }

    static boolean isSortedHelper(int[] arr, int i){
        if(i == arr.length){
            return true;
        }
        if(arr[i] < arr[i-1]){
            return false;
        }
        return isSortedHelper(arr, ++i);

    }
}
