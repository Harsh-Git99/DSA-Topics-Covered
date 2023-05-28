package recursionRevision;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    //having return type void





    //having return type int[]
    static int[] mergeSort(int[] arr){

        if(arr.length == 1){ // i == start point and  j == end  point of given array
            return arr;
        }
        int mid = arr.length/2;

        int[] p1 = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] p2 = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(p1,p2);

    }

    static int[] merge (int[] first , int[] second ){
        int[] ans = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                ans[k] = first[i];
                i++;
                k++;

            } else if (first[i] > second[j]) {
                ans[k] = second[j];
                j++;
                k++;
            }
        }
        // by this point one of the arrays are emptied

        while(i < first.length){
            ans[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            ans[k] = second[j];
            j++;
            k++;
        }
        return ans;
    }
}
