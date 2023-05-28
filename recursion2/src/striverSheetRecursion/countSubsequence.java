package striverSheetRecursion;

import java.util.List;

public class countSubsequence {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;

        System.out.println(getCount(arr,k));
    }

    static int getCount(int[]arr, int k){

       int c =  countSequences(arr,0,k,0);

        return c;

    }

    static int countSequences(int[] arr, int sum, int k, int index){

        if(index == arr.length){
            if(sum == k){
                return 1;
            }
            return 0;
        }


        sum += arr[index];
        int l = countSequences(arr,sum,k,index+1);

        sum -= arr[index];
        int r =  countSequences(arr,sum,k,index+1);

        return l+r;

    }
}
