package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDisappearedNums {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(arr));


        System.out.println(SearchingDisappearedNums(arr));

    }

    static ArrayList<Integer> SearchingDisappearedNums(int[] arr){

        int last = arr.length;
        int i = 0;
        while (i<last){
            int correct = arr[i]-1;
            if( arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else
                i++;
        }

        // for all the missing numbers

        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]!=index+1){
                 ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
}
