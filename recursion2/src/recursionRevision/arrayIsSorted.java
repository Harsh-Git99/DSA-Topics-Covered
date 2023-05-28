package recursionRevision;

import java.util.Arrays;

public class arrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,8,5,7};

        System.out.println(isSorted(arr));
    }

    static boolean isSorted(int[] arr){
        if(arr.length == 1){
            return true;
        }

        if(arr[0] > arr[1]){
            return false;
        } return isSorted(Arrays.copyOfRange(arr,1,arr.length));
    }
}
